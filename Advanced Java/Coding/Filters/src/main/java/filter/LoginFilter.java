package filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpFilter;

public class LoginFilter extends HttpFilter {
	Connection con;
	public void destroy() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		try {
			String s1=request.getParameter("uname");
			String s2=request.getParameter("pword");
			PreparedStatement ps=con.prepareStatement("select * from loginfo where uname=? and pword=?");
			ps.setString(1, s1);
			ps.setString(2, s2);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				chain.doFilter(request, response);
				//the above line indicates web container to check web.cml to-
				//-execute any other filter or servlet whichever is configured.
			}
			else
			{
				PrintWriter pw=response.getWriter();
				pw.println("<html><body text=red><center>");
				pw.println("<h1>Invalid Username/Password</h1>");
				pw.println("</center></body></html>");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public void init(FilterConfig fConfig) throws ServletException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SYSTEM","login","login");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}