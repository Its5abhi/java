
import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class slip18_2
 */
public class slip18_2 extends HttpServlet {
	
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		response.setContentType("html/text");
		String name=request.getParameter("t1");
		String classs=request.getParameter("t2");
		int marks=Integer.parseInt(request.getParameter("t3"));
	   
		out.println("Name="+name);
		out.println("Class="+classs);
		out.println("Total Marks="+marks);
		float per=marks/5;
		out.println("percentage="+per);
		
		if(per>90)
			 out.println("O grade");
		else if(per>80)
			 out.println("A grade");
		else if(per>60)
			 out.println("A+ grade");
		else if(per>50)
			 out.println("B grade");
	
	 
	}

}
