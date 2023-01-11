package JDBC;

import java.sql.*;

public class Class6 {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SYSTEM","system","tiger");
		System.out.println("Connection Succeded now we can access the data in the database");	
	}
}
