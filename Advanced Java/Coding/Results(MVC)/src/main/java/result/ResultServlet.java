package result;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s1=request.getParameter("hno");
		int hno=Integer.parseInt(s1);
		ResultDAO rdao=new ResultDAO();
		ResultBean rb=rdao.getResult(hno);
		request.setAttribute("result", rb);
		RequestDispatcher rd=request.getRequestDispatcher("/results.jsp");
		rd.forward(request, response);
	}

}
