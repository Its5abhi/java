<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
     <form method="post" action="prime.jsp">
        Enter The Number:
        <input type="text" name="t1">
        <input type="submit">
     </form>
</body>
</html>
<% 
      String s1=request.getParameter("t1");
     if(s1!=null){      

      int n=Integer.parseInt(s1);
      
      int f=0;
      for(int i=1;i<n;i++){
    	  if(n%i==0){
    		  f+=i;
    	  }
      }
      if(f==n){
    	  out.println("<h1 style='color:red'>Perfect No</h1>");
      }
     }

%>