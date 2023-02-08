package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//program for updating through ResultSet by absolute
public class Class17A {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SYSTEM","system","tiger");
			Statement stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=stmt.executeQuery("select tno,tname,tgender from test1002");
			rs.absolute(5);
			rs.updateString(2,"varma");
			rs.updateRow();
			System.out.println("one Record updated successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
