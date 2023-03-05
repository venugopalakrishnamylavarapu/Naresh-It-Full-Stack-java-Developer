package sListener;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext sc=getServletContext();
		Connection conn=(Connection)sc.getAttribute("oracle");
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolor=red text=yellow><h1>");
		pw.println("Connection Object retrieved successfully");
		pw.println("</h1></body></html>");
	}
}