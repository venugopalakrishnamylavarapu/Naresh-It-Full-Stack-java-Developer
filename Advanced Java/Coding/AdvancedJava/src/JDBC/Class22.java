package JDBC;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.Savepoint;

/*
-> generally a query is called a transaction.
 
 from JDBC 4.0 version the driver is automatically loaded we just need to connect to the database.
 in this class we discuss about Transaction management in database through jdbc
 
 1)if we set the auto commit to false then we need to manually commit after each transaction 
  if we dont the statement which we wrote like sysout will get executes without any error but the querries will not be effected in data base.
  
 
*/
public class Class22 {
	public static void main(String[] args) {
		try {
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SYSTEM","system","tiger");
			System.out.println(conn.getAutoCommit());
			conn.setAutoCommit(false);
			System.out.println(conn.getAutoCommit());
			Statement stmt=conn.createStatement();
			System.out.println("Value inserted into the database successfully");
			Savepoint sp=conn.setSavepoint();
			stmt.executeUpdate("delete test1002 where tno=6");
			System.out.println("record deleted succesfully");
//			conn.rollback(sp);
//			stmt.executeUpdate("insert into test1002 values(5,'Madhuri','F')");
//			System.out.println("record restored Succesfully");
			conn.commit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
