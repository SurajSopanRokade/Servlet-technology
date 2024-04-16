<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Index JSP</p>
	<!-- jsp=html+java -->
	<!-- Scriptlet tag -->
	
	<%
		//jsp provides implicite object
		out.print("hello jsp");// out.print is object of jsp writer
		String name;
	%>
	<%!
		public int sqr(int a){
		 return a*a;
		}
	%>
	<h1>
	<%
		out.print("Square is : "+sqr(5));
	%>
	</h1>
	<%="Squre is : "+sqr(25) %>
	<a href="lcd">click here for life cycle</a>
	<a href="login.jsp">login page</a>
</body>
</html>