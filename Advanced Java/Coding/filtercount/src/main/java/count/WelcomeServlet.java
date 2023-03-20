package count;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
public class WelcomeServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext sc=request.getServletContext();
		int count=(int)sc.getAttribute("views");
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolor=green text=yellow>");
		pw.println("<h1>There are currently "+count+" are watching this page");
		pw.println("</body></html>");
		
	}

}
