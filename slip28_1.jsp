<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form method="post" action="slip28_1.jsp">
      Enter The String:
      <input type="text" name="t1">
      <input type="submit">
    </form>
</body>
</html>

<%

  String s1=request.getParameter("t1");
  StringBuffer b1=new StringBuffer(s1);
 
  out.println(b1.reverse());
%>