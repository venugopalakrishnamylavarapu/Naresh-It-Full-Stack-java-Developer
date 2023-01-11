package JDBC;
//carefull here we cant write int i=0 in for loop since in database index starts from 1.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Class11 {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SYSTEM","system","tiger");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from test1002");
		ResultSetMetaData rsmd=rs.getMetaData();
		for(int i=1;i<=rsmd.getColumnCount();i++)
			System.out.print(rsmd.getColumnName(i)+"\t");
		System.out.println();
		while(rs.next())
		{
			for(int i=1;i<=rsmd.getColumnCount();i++)
				System.out.print(rs.getString(i)+"\t");
			System.out.println();
		}
		System.out.println("Data Successfully Retrieved");
	}
}
/*
 		//or u can itterate in a single while loop
 		 while(rs.next())
 		 {
 		 	System.out.print(rs.getInt("rollno")+"\t");
 		 	System.out.print(rs.getInt("rollno")+"\t");
 		 	System.out.print(rs.getInt("marks"));
 		 }
 		 
 		 //if there are 100 columns we can't do the columns like 100 right??  so we can 
 		 //write an alternative to this in a while loop like the below.
 		   
 		  while(rs.next())
 		  {
 		  	for(int i=1;i<=n;i++)
 		  	{
				System.out.print(rs.getString(i)+"\t");
			}
			System.out.println();
 		  }	
 		  	 		  
 		  
 		  

 */