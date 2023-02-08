import java.io.*;
import jakarta.servlet.*;

class FirstServlet extends GenericServlet
{
public void service(ServletRequest req,ServletResponse res)
	{
		try{
		PrintWriter pw=res.getWriter();
		pw.println("Welcome to Servlets");
		}catch(Exception e)
		{	
			e.printStackTrace();	
		}
	}
}