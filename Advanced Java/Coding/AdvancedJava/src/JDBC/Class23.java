package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class Class23 {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Tno:");
			int Tno=sc.nextInt();sc.nextLine();
			System.out.println("enter the Tname:");
			String tname=sc.nextLine();
			System.out.println("enter the gender");
			String tgender=sc.nextLine();
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SYSTEM","system","tiger");
			PreparedStatement pstmt=conn.prepareStatement("insert into test1002 values(?,?,?)");
			pstmt.setInt(1, Tno);
			pstmt.setString(2, tname);
			pstmt.setString(3,tgender);
			pstmt.executeUpdate();
			System.out.println("One record inserted Successfully");
		}catch(Exception e)
		{
		e.printStackTrace();	
		}
	}
}
