<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
       <table border="1">
       <tr>
         <th>Roll no</th>
         <th>Name</th>
         <th>per</th>
       </tr>
       
       <%
          Class.forName("org.postgresql.Driver");
          Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","");
          Statement st=con.createStatement();
          ResultSet rs=st.executeQuery("select * from stud");
          while(rs.next()){ 
       %>
       <tr>
           <td> <%out.print(rs.getInt(1)); %></td>
           <td> <%out.print(rs.getString(2)); %></td>
           <td> <%out.print(rs.getFloat(3)); %></td>  
       </tr>
       <%} 
        rs.close();
        st.close();
        con.close();
       %>
</body>
</html>