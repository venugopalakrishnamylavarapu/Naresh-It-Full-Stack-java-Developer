package filter;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s=request.getParameter("uname");
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolor=black text=yellow><center>");
		pw.println("<h1>Welcome "+s+"</h1>");
		pw.println("</center></body></html>");
	}

}
