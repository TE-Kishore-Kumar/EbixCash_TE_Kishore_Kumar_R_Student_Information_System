<%@page import="com.ebix.studentinformationsystem.beans.StudentInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	StudentInfo info = (StudentInfo) request.getAttribute("user");
%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
<link
	href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;500;600&display=swap"
	rel="stylesheet">
<style type="text/css">
<%@
include file="welcome.css"
 %>
</style>
<title>Document</title>
</head>

<body>
	<div class="background">
		<div class="shape"></div>
		<div class="shape"></div>
	</div>
	<form action="./showdata" method="get">
		<%
			if (info != null) {
		%>
		<h3 style="text-align: center;">
			Welcome
			<%=info.getName()%>
		</h3>
		<%
			}
		%>
		<select name="details" id="details">
			<option onclick="value()" id="details" value="year1">Year I</option>
			<option id="details" value="year2">Year II</option>
			<option id="details" value="year3">Year III</option>
		</select>
		<button type="submit">OK</button>
	</form>
</body>

</html>