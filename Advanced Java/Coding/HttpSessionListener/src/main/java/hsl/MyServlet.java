package hsl;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class MyServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs=request.getSession();
		hs.setMaxInactiveInterval(20);
		int count=(int)hs.getAttribute("users");
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolor=green text=yellow><h1>");
		pw.println("At present there are "+count+" users accessing this server");
		pw.println("</h1></body></html>");
	}
}