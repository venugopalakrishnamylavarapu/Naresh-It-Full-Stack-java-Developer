package basic;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

/**
 * Servlet implementation class TableServlet
 */
public class TableServlet extends GenericServlet implements Servlet {

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		pw.println("<html><body>");
		pw.println("<table border=2>");
		for(int i=0;i<=100;i++)
		{
			pw.println("<tr><td>5</td>");
			pw.println("<td>*</td>");
			pw.println("<td>"+i+"</td>");
			pw.println("<td>=</td>");
			pw.println("<td>"+5*i+"</td></tr>");
		}
		pw.println("</table></body></html>");
	}

}
