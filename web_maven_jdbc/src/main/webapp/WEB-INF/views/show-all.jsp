<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="logic" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<thead>
		<th>id</th>
		<th>Name</th>
		<th>Email</th>
		<th>Department</th>
	</thead>
	<tbody>
	<logic:forEach var="student" items="{$students}">
		<tr>
			<td>student.id</td>
			<td>student.name</td>
			<td>student.email</td>
			<td>student.department</td>
		</tr>
	</logic:forEach>	
	</tbody>
</table>
</body>
</html>