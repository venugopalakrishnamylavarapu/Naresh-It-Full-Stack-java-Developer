package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Class13
{
	public static void main(String[] args)throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SYSTEM","system","tiger");	
		PreparedStatement pstmt=con.prepareStatement("select tname from test1002 where tno=?");
		pstmt.setString(1, args[0]);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getString(1));
		}
	}
}
