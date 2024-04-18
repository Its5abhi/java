
import java.io.*;
import java.sql.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.DriverManager;

/**
 * Servlet implementation class user_password
 */
public class user_password extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public user_password() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String user="ddd";
		String pass="ddd";
		PrintWriter out=response.getWriter();
		
		try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/abhi","postgres","");
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery("select * from login where username='"+user+"' and password='"+pass+"'");
			
			if(rs.next()) {
				out.println("<h1>Login succ");
			}
			else {
				out.println("<h1>Unsuccesful");
			}
			
		} catch (Exception e) {
			out.print(e);
		}
	}

}
