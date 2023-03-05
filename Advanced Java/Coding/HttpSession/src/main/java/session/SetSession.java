package session;
/*
 HttpSession using Cookie
 */
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SetSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s1=request.getParameter("book1");
		String s2=request.getParameter("book2");
		String s3=request.getParameter("book3");
		HttpSession hs=request.getSession();
		hs.setAttribute("book1",s1);
		hs.setAttribute("book2",s2);
		hs.setAttribute("book3",s3);
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolor=red text=yellow><center>");
		pw.println("<h1>Your Books are Added to Cart</h1>");
		String s=response.encodeURL("get");
		pw.println("<a href="+s+">Next</a>");
		pw.println("</center></body></html>");		
	}
}
