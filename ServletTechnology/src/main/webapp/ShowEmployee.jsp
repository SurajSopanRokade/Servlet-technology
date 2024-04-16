<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*, com.demo.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% List<Employee> elist = (List<Employee>)session.getAttribute("elist"); %>
	<h1>Employee Details</h1>
	<table>
		<tr>
			<th>Employee_id</th>
			<th>Employee_name</th>
			<th>Employee_salary</th>
		</tr>
		<% for(Employee e:elist) {%>
		<tr>
			<td><%=e.getEmp_id() %></td>
			<td><%=e.getEmp_name() %></td>
			<td><%=e.getSalary() %></td>
		</tr>
		<% }%>
	</table>
</body>
</html>