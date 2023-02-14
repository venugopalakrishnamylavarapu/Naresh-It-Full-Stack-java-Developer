package JDBC;
//program to connect java database and run a command into the database
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Class7 {
	public static void main(String[] args) {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SYSTEM","system","tiger");
		Statement stmt=con.createStatement();
		stmt.execute("drop table testt20");
		System.out.println("all queries have been executed");
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
