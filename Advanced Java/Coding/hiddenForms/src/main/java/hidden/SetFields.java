package hidden;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SetFields extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s1=request.getParameter("book1");
		String s2=request.getParameter("book2");
		String s3=request.getParameter("book3");
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolor=yellow text=blue><center>");
		pw.println("<h1>Your Books are added to cart</h1>");
		pw.println("<form action=get>");
		pw.println("<input type=hidden name=book1 value="+s1+">");
		pw.println("<input type=hidden name=book2 value="+s2+">");
		pw.println("<input type=hidden name=book3 value="+s3+">");
		pw.println("<input type=submit value=Next>");
		pw.println("</form></center></body></html>");
	}
}
