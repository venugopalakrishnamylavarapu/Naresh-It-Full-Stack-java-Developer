package Login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class RegServlet extends HttpServlet {
	Connection conn;
   	public void init(ServletConfig config) throws ServletException {
   		try {
   			ServletContext sc=config.getServletContext();
   			String s1=sc.getInitParameter("driver");
   			String s2=sc.getInitParameter("url");
   			String s3=sc.getInitParameter("username");
   			String s4=sc.getInitParameter("password");
		Class.forName(s1);
		conn=DriverManager.getConnection(s2,s3,s4);
   		}catch(Exception e)
   		{
   			e.printStackTrace();
   		}
   		}
	public void destroy() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		String s1=request.getParameter("fname");
		String s2=request.getParameter("lname");
		String s3=request.getParameter("uname");
		String s4=request.getParameter("pword");
		PreparedStatement pstmt=conn.prepareStatement("insert into loginfo values(?,?,?,?)");
		pstmt.setString(1, s1);
		pstmt.setString(2, s2);
		pstmt.setString(3, s3);
		pstmt.setString(4, s4);
		pstmt.executeUpdate();
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolor=cyan text=blue><center>");
		pw.println("<h1>You Have Registered Successfully</h1>");
		pw.println("<a href=\"login.html\">Login</a>");
		pw.println("</center></body></html>");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	}

}
