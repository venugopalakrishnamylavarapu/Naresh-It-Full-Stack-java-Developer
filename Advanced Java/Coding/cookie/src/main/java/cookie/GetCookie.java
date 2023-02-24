package cookie;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GetCookie extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolor=green text=yellow>");
		pw.println("<h1><u>Selected Books</u></h1>");
		Cookie[] c=request.getCookies();
		for(Cookie c2:c)
		{
			pw.println(c2.getValue()+"</br>");
		}
		pw.println("</body></html>");
	}

}
