package first;

import java.io.*;

import jakarta.servlet.*;


/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends GenericServlet {
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		pw.println("<!DOCTYPE html><body style=\"display:flex;height:100vh;width:100%;justify-content:center;align-items:center\" bgcolor=\"blue\" text=\"yellow\"><h1>");
		pw.println("Welcome to Servlets");
		pw.println("</h1></body></html>");		
	}
}
