<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>Welcome ,  you are logged in now... </h1>
<% ServletContext globalCon = this.getServletContext(); %>

<h2>Name : <%= globalCon.getAttribute("username") %></h2>
<h2>password : <%= globalCon.getAttribute("password") %></h2>

<%
	for(int i=1;i<=5;i++){
%>

<%=i %> : <input type="text>" id="text<%=i %>>"><br>
<%
	}
%>

</body>
</html>