package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//Prepared Statement 
//the plus point of using preparedStatement is we can compile it once then execute numerous times(we can insert dynamic sql queries and execute it through command line)
public class Class12 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SYSTEM","system","tiger");
			PreparedStatement pstmt=con.prepareStatement("insert into test1002 values(?,?,?)");
			pstmt.setInt(1,Integer.parseInt(args[0]));
			pstmt.setString(2, args[1]);
			pstmt.setString(3,args[2]);
			pstmt.executeUpdate();
			System.out.println("One record inserted successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
