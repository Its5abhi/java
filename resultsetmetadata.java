import java.sql.*;
public class resultsetmetadata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","");
        	Statement st=con.createStatement();
        	
        	ResultSet rs=st.executeQuery("select * from stud");
        	ResultSetMetaData dbm=rs.getMetaData();
        	
        	System.out.println(dbm.getColumnClassName(1));
        	System.out.println(dbm.getColumnCount());
        	 
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
