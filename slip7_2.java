import java.sql.*;
import java.util.Scanner;
public class slip7_2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
        Class.forName("org.postgresql.Driver");
         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","");
         Statement st=con.createStatement();
         
         
	    st.execute("create table Product(pid int,name text,price int)");
	    PreparedStatement pst=con.prepareStatement("insert into Product values(?,?,?)");
	    pst.setInt(1, 101);
	    pst.setString(2, "om");
	    pst.setInt(3,10000);
	    pst.executeUpdate();
	    
	    pst.setInt(1, 102);
	    pst.setString(2, "sai");
	    pst.setInt(3,10000);
	    pst.executeUpdate();
	    
	    pst.setInt(1, 103);
	    pst.setString(2, "ram");
	    pst.setInt(3,10000);
	    pst.executeUpdate();
	    
	    pst.setInt(1, 104);
	    pst.setString(2, "sham");
	    pst.setInt(3,10000);
	    pst.executeUpdate();
	    
	    pst.setInt(1, 105);
	    pst.setString(2, "aman");
	    pst.setInt(3,10000);
	    pst.executeUpdate();
	    
	    
	    ResultSet rs=st.executeQuery("select * from Product");
	    while(rs.next()) {
	    	System.out.println(rs.getInt(1));
	    	System.out.println(rs.getString(2));
	    	System.out.println(rs.getInt(3));
	    }
	}

}
