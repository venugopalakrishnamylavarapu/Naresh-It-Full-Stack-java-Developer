package result;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultDAO {
	public ResultBean getResult(int hno)
	{
		ResultBean rb=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SYSTEM","results","results;");
			PreparedStatement pstmt=conn.prepareStatement("select * from results where hno=?");
			pstmt.setInt(1, hno);
			ResultSet rs=pstmt.executeQuery();
			rb=new ResultBean();
			if(rs.next())
			{
				rb.setHno(rs.getInt(1));
				rb.setName(rs.getString(2));
				rb.setC(rs.getInt(3));
				rb.setCpp(rs.getInt(4));
				rb.setJava(rs.getInt(5));
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return rb;
	}
}
