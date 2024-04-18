<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
      <form method="post" action="reverse.jsp">
         <input type="text" name="t1">
         <input type="submit">
      </form>
</body>
</html>

<% 
     String s1=request.getParameter("t1");
     StringBuffer sbr=new StringBuffer(s1);
     if(s1!=null){
    	  out.println("<h1>"+sbr.reverse());
     }
%>


