package session;
/*
 HttpSession using Cookies
 */
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class GetSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		HttpSession hs=request.getSession();
		String s1=(String) hs.getAttribute("book1");
		String s2=(String) hs.getAttribute("book2");
		String s3=(String) hs.getAttribute("book3"); 
		pw.println("<html><body bgcolor=red text=yellow><h1>");
		pw.println("<u>Selected Books</u></h1>");
		if(s1!=null)	pw.println(s1+"<br>");
		if(s2!=null)	pw.println(s2+"<br>");
		if(s3!=null)	pw.println(s3+"<br>");
		pw.println("</body></html>");
		
		
	}

}
