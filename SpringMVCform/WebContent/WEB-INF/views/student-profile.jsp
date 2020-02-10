<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Manage Your profile here</h1>
<hr>
<spring:form action="savestudent" method="post" modelAttribute="student">
	<spring:label path="uname">Enter name</spring:label>
	<spring:input path="uname"/>
	<spring:errors path="uname"/>
	<br/>
	<br/>
	<spring:label path="email">Enter email</spring:label>
	<spring:input path="email"/>
	<br/>
	<br/>
	<spring:label path="country">Country</spring:label>
	<spring:select path="country">
		<spring:options items="${student.countries}"/>
		<!--<spring:option value="FR" label="France"/>
		<spring:option value="IND" label="India"/>
		<spring:option value="AUS" label="Australia"/>
		<spring:option value="ENG" label="England"/>-->
	</spring:select>
	<br/>
	<br/>
	<spring:label path="favoriteLanguage">Fav. Language</spring:label><br/>
	<spring:radiobutton path="favoriteLanguage" value="python"/>Python<br/>
	<spring:radiobutton path="favoriteLanguage" value="Java"/>Java<br/>
	<spring:radiobutton path="favoriteLanguage" value="Dotnet"/>Dotnet<br/>
	<spring:radiobutton path="favoriteLanguage" value="JS"/>JS<br/>
	<br/>
	
	<spring:label path="os">os experienced</spring:label>
	<br/>
	<spring:checkbox path="os" value="Windows"/>Windows&nbsp;
	<spring:checkbox path="os" value="Mac"/>Mac&nbsp;
	<spring:checkbox path="os" value="Android"/>Android&nbsp;
	<br/>
	<br/>
	<spring:label path="age">Enter age</spring:label>
	<spring:input path="age"/>
	<spring:errors path="age"/>
	<br/>
	<br/>
	<spring:label path="uid">Enter id</spring:label>
	<spring:input path="uid"/>
	<spring:errors path="uid"/>
	<br/>
	<input type="submit" value="Submit">
	
</spring:form>

<!--  <form action="savestudent" method="post">
enter name : <input type="text" name="uname">
enter email : <input type="text" name="email">
<input type="submit"value="submit">
</form>  -->

</body>
</html>