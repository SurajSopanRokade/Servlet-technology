<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>this is sent page</h1>
<%
//String name=request.getParameter("username");//request is implicit object of HttpServletRequest
String name=(String)session.getAttribute("uname");
out.print("welcome :"+name);
%>
</body>
</html>