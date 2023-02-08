package JDBC;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

//by moveToInsertRow() inserting data in database
//to delete a record in a database with the method
public class Class18 {
	public static void main(String[] args) {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SYSTEM","system","tiger");
		Statement stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=stmt.executeQuery("select tno,tname,tgender from test1002");
		//the below part upto insertRow() method is insertion through java methods
		/*
		rs.moveToInsertRow();
		rs.updateInt(1, 13);
		rs.updateString(2, "Arjuna");
		rs.updateString(3, "M");
		rs.insertRow();
		*/
		
		rs.absolute(13);
		rs.deleteRow();		
		System.out.println("One Record Deleted Successfully");
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
