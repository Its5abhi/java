

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class slip18_22
 */
public class slip18_22 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String s1=request.getParameter("t1");
		int marks=Integer.parseInt(request.getParameter("t2"));
		
		float per=marks/5;
		if(per>80) {
			out.print("<h1>O grade");
			
		}
		else {
			out.println("<h1>A Grade");
		}
	}

}
