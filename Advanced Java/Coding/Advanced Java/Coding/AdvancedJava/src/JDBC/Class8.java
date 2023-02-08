package JDBC;
//program to insert records to database(DML commands)
import java.sql.*;
/*check if the table is already created 
   if not it executes successfully.
   if it is then it will show an exception of already object there*/
//program to insert a record
public class Class8 {
	public static void main(String[] args)
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SYSTEM","system","tiger");
			Statement stmt=con.createStatement();
			stmt.executeUpdate("insert into test1002 values(1,'Venu')");
			System.out.println("inserted one record Successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
