package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Class14 {
	public static void main(String[] args) {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SYSTEM","system","tiger");
		CallableStatement cstmt=conn.prepareCall("{call insertpro(?,?,?)}");
		cstmt.setInt(1, Integer.parseInt(args[0]));
		cstmt.setString(2, args[1]);
		cstmt.setString(3, args[2]);
		cstmt.execute();
		System.out.println("One recorded Inserted Successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
