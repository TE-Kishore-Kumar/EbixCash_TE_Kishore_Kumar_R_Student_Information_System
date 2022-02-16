<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	String err = (String) request.getAttribute("err");
%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Login Page</title>

<link rel="preconnect" href="https://fonts.gstatic.com">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
<link
	href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;500;600&display=swap"
	rel="stylesheet">
<style type="text/css">
<%@include file="login.css"%>
</style>
</head>
<body>
	<div class="background">
		<div class="shape"></div>
		<div class="shape"></div>
	</div>
	<form action="./login" method="post">
		<%
			if (err != null && !err.isEmpty()) {
		%>
		<h2 style="color: red"><%=err%></h2>
		<%
			}
		%>
		<h3>Login Here</h3>

		<label for="username">Roll Number</label> <input type="number"
			placeholder="Roll Number" id="username" name="rollNumber"
			required="required"> <label for="password">Password</label> <input
			type="password" placeholder="Password" id="password" name="password"
			required="required">

		<button type="submit">Log In</button>
	</form>
</body>
</html>
