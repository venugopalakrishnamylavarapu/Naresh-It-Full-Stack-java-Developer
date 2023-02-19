package Login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	Connection conn;
	public void init(ServletConfig config) {
			try {
				ServletContext sc=config.getServletContext();
				String s1=sc.getInitParameter("driver");
				  String s2=sc.getInitParameter("url");
				  String s3=sc.getInitParameter("username");
				  String s4=sc.getInitParameter("password");
					Class.forName(s1);
					conn=DriverManager.getConnection(s2,s3,s4);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
	}
	public void destroy()
	{
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			String s1=request.getParameter("uname");
			String s2=request.getParameter("pword");
			PreparedStatement pstmt=conn.prepareStatement("select * from loginfo where uname=? and pword=?");
			pstmt.setString(1, s1);
			pstmt.setString(2, s2);
			ResultSet rs=pstmt.executeQuery();
			PrintWriter pw=response.getWriter();
			if(rs.next())
			{//for Servlet Forwarding use the below 2 lines of code
//				RequestDispatcher rd=request.getRequestDispatcher("/welcome");
//				rd.forward(request, response);
				response.sendRedirect("welcome");
			}
			else
			{
				pw.println("<font color=yellow>");
				pw.println("Invalid Username/Password</font>");
				RequestDispatcher rd=request.getRequestDispatcher("/login.html");
				rd.include(request, response);
			}
		} catch (SQLException | IOException | ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
