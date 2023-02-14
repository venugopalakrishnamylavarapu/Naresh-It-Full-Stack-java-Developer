package PracticePack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Prac {
//	public static void main(String[] args) throws Exception {
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SYSTEM","system","tiger");
//		Statement stmt=con.createStatement();
//		ResultSet rs=stmt.executeQuery("select * from test1002");
//		ResultSetMetaData rsmd=rs.getMetaData();
//		for(int i=1;i<=rsmd.getColumnCount();i++)
//			System.out.print(rsmd.getColumnName(i)+"\t");
//		System.out.println();
//		while(rs.next())
//		{
//			System.out.print(rs.getInt(1)+"\t");
//			System.out.println(rs.getString(2));
//		}
//		System.out.println("Data Retrived Successsfully!");		
//	}
	public static void main(String[] args) throws Exception
	{
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SYSTEM","system","tiger");
//		Statement stmnt=con.createStatement();
//		ResultSet rs=stmnt.executeQuery("select * from test1002");
//		ResultSetMetaData rsmd=rs.getMetaData();
//		for(int i=1;i<=rsmd.getColumnCount();i++)
//		{
//			System.out.print(rsmd.getColumnName(i)+"\t");
//		}
//		System.out.println();
//		while(rs.next())
//		{
//			for(int i=1;i<=rsmd.getColumnCount();i++)
//				System.out.print(rs.getString(i)+"\t");
//			System.out.println();
//		}
//		System.out.println("Data Has been retrived successfully");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SYSTEM","system","tiger");
		Statement stmt=con.createStatement();
		stmt.executeUpdate("update test1002 set tgender='F' where tno=10");
		ResultSet rs=stmt.executeQuery("select * from test1002");
		ResultSetMetaData rsmd=rs.getMetaData();
		for(int i=1;i<=rsmd.getColumnCount();i++)
			System.out.print(rsmd.getColumnName(i)+"\t");
		System.out.println();
		while(rs.next())
		{
			for(int i=1;i<=rsmd.getColumnCount();i++)
			{
				System.out.print(rs.getString(i)+"\t");
			}
			System.out.println();			
		}
		System.out.println("Data Retrived Successfully!!");
	}
}
