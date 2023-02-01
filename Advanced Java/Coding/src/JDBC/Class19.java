package JDBC;
//here we passed image to the database
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Class19 {

	public static void main(String[] args) {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SYSTEM","system","tiger");
		PreparedStatement pstmt=conn.prepareStatement("insert into images values(?,?)");
		pstmt.setString(1, args[0]);
		FileInputStream fis=new FileInputStream(args[1]);
		pstmt.setBinaryStream(2, fis,fis.available());//here 1st is dynaic ? number,2nd is inputstream,3rd is filebyte size .available() is used
		pstmt.executeUpdate();
		System.out.println("One image inserted ");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
