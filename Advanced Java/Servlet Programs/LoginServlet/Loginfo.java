import java.sql.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.*;
import java.io.PrintWriter;

public class LoginServlet implements HttpServlet{
	Connection conn;
	public void init(ServletConfig servconf)
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SYSTEM","login","login");	
	}
	public void destroy() throws SQLException
	{
		conn.close();
	}
	protected void doPost(HttpServletRequest hrequest,HttpServletResponse hresponse)
	{
	try{
	String s1=hrequest.getParameter("uname");
	String s2=hrequest.getParameter("pword");
	PreparedStatement pstmt=conn.prepareStatement("select * from loginfo where uname=? and pword=?");
	pstmt.setString(1,s1);
	pstmt.setString(2,s2);
	ResultSet rs=pstmt.executeQuery();
	PrintWriter pw=hresponse.getWriter();
	pw.println("<html><body bgcolor=yellow text=green><h1>");
	if(rs.next())
		pw.println("welcome "+s1);
	else
		pw.println("Invalid UserName/Password);
	pw.println("</h1></body></html>");
	}catch(Exception)
	{
		e.printStackTrace();
	}	
	}

}