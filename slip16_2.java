import java.sql.*;
import java.util.*;

public class slip16_2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		 Class.forName("org.postgresql.Driver");
         Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","");
         Statement st=con.createStatement();
         PreparedStatement pst=con.prepareStatement("insert into teacher values(?,?,?)");
         
         for (int i = 1; i <=2; i++) {
			System.out.println("Enter Tno,Name,sub");
			int tno=sc.nextInt();
		    String name=sc.next();
		    String sub=sc.next();
		   pst.setInt(1, tno);
		   pst.setString(2, name);
		   pst.setString(3, sub);
		   pst.executeUpdate();
         }
         
         ResultSet rs=st.executeQuery("select * from teacher");
         while(rs.next()) {
        	 
        		 if(rs.getString(3).equals("JAVA")) {
        			 System.out.println(rs.getInt(1));
        			 System.out.println(rs.getString(2));
        			 System.out.println(rs.getString(3));
        			 
        		 }
         }
	}

}
