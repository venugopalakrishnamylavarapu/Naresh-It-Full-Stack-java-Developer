package basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;

/**
 * Servlet implementation class TimeServlet
 */
@WebServlet("/time")
public class TimeServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LocalTime lt=LocalTime.now();
		PrintWriter pw=response.getWriter();
		pw.println("<html><body><h1>");
		pw.println(lt);
		pw.println("</h1></body></html>");
	}
}
