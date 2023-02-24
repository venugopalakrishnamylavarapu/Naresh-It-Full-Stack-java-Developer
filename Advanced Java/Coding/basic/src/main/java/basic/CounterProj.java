package basic;
//counting no of views.
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

/**
 * Servlet implementation class CounterProj
 */
public class CounterProj extends GenericServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int count=0;
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		count++;
		PrintWriter pw=response.getWriter();
		pw.println("<html><body><h1>");
		pw.println("This page has been accessed "+count+" times");
		pw.println("</h1></body></html>");		
	}

}
