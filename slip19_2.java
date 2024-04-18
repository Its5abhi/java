import java.sql.*;
import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class slip19_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
  	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		try {
			
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/abhi","postgres","");
			Statement st=con.createStatement();
			
			String user=request.getParameter("t1");
			String password=request.getParameter("t2");
			
			ResultSet rs=st.executeQuery("select * from login where username='"+user+"' AND password='"+password+"'");
			
			if(rs.next())
				 out.println("<h1>Loginsuccesfully</h1>");
			else
				out.print("<h1>User & password incorrect");
		} catch (Exception e) {
			out.print(e);
		}
	}
}
