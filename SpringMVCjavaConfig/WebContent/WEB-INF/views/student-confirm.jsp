<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="logic" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student saved successfully</h1>
<hr/>
<h2>Name : ${student.uname }</h2>
<h2>Email : ${student.email}</h2>
<h2>Country : ${student.country}</h2>
<h2>Fav.Language : ${student.favoriteLanguage}</h2>
<h2>Exp. os :</h2>
<ul>
	<logic:forEach var="item" items="${student.os }">
		<li>${item}</li>
	</logic:forEach>
</ul>
<h2>Eligibility : age-${student.age}</h2>
<logic:if test="${student.age >= 18}">
	<h3>Eligible for vote..</h3>
</logic:if>
<logic:if test="${student.age < 18}">
	<h3>Not Eligible for vote..</h3>
</logic:if>
<h2>id : ${student.uid}</h2>
</body>
</html>