<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring-form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<spring-form:form action="${pageContext.request.contextPath}/student/save" method="post" modelAttribute="student">
	<spring-form:label path="id">Enter id :</spring-form:label>
	<spring-form:input path="id" />
	<br/>
	<br/>
	<spring-form:label path="name">Enter name :</spring-form:label>
	<spring-form:input path="name" />
	<br/>
	<br/>
	<spring-form:label path="email">Enter email :</spring-form:label>
	<spring-form:input path="email"/>
	<br/>
	<br/>
	<input type="submit" value="Update">
</spring-form:form>
</body>
</html>