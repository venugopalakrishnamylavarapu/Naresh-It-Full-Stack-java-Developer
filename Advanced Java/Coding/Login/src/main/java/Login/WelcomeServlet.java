package Login;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s1=request.getParameter("uname");
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolor=cyan text=blue><center><h1>");
		pw.println("Welcome "+s1);
		pw.println("</h1></center></body></html>");
	}
}
