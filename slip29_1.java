import java.sql.*;
public class slip29_1 {
       public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from stud");
			
			ResultSetMetaData rsm=rs.getMetaData();
			
			System.out.println("Catlog Name="+rsm.getCatalogName(1));
			System.out.println("ColumnClassName="+rsm.getColumnClassName(2));
			System.out.println("ColumnCount="+rsm.getColumnCount());
			System.out.println("ColumnDisplaySize="+rsm.getColumnDisplaySize(2));
			System.out.println("ColumnType="+rsm.getColumnType(2));
			System.out.println("ColumnName="+rsm.getColumnName(2));
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
