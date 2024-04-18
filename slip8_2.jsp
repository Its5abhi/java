<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
     <form method="post" action="slip8_2.jsp">
        Enter Number:
       <input type="text" name="t1">
       <input type="submit">
     </form>
     <% 
         String s1=request.getParameter("t1");
         if(s1!=null){
        	 
        int num=Integer.parseInt(s1);
         int i; 
         for(i=2; i<num ;i++){
        	 if(num%i==0){
        		 break;
        	 }
         }
         if(i==num){
        	 out.println("<h1 style='color:blue;'> Prime number <h1>");
         }
         else{
        	 out.println("<h1 style='color:RED;'> Not a Prime number <h1>");
         }
         } 
     %>
</body>
</html>




