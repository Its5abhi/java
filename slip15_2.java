
import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class slip15_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int n=1;
		Cookie ck=new Cookie("count",""+n);
		 response.addCookie(ck);
		 String s1=ck.getValue();
		  n=Integer.parseInt(s1);
	     if(n==1) {
	    	 out.println("<h1 style='color:green'>WELCOME<h1>");
	    	 n++;
	    	 s1=""+n;
	    	 ck.setValue(s1);
	    	 out.println(n);
	     }
	     else {
	    	 out.println("<h1>Page visited="+n+"</h1>");
             n++;
             s1=""+n;
	    	 ck.setValue(s1);
	    	 
	     }
	}

}
