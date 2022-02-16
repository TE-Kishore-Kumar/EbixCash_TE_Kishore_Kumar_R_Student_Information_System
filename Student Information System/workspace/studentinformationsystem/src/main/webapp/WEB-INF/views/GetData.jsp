<%@page import="java.util.List"%>
<%@page import="com.ebix.studentinformationsystem.beans.StudentInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	List<StudentInfo> info = (List<StudentInfo>) request.getAttribute("data");
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
<title>Students Details</title>
<style type="text/css">
<%@ include file ="getdata.css" %>
</style>
</head>
<body>
	<div class="background">
		<div class="shape"></div>
		<div class="shape"></div>
	</div>
<form action="./logout">
	<h3>Student Details</h3>
	<table>
	<tr>
			<th>Roll Number</th>
			<td>&emsp;<b><%=info.get(0).getRollNumber()%></b></td>
		</tr>
		<tr>
			<th>Student Name</th>
			<td>&emsp;<b><%=info.get(0).getName()%></b></td>
		</tr>
		<tr>
			<th>Student BloodGroup</th>
			<td>&emsp;<b><%=info.get(0).getBloodGroup()%></b></td>
		</tr>
		<tr>
			<th>English</th>
			<td>&emsp;<b><%=info.get(0).getEnglish()%></b></td>
		</tr>
		<tr>
			<th>Maths</th>
			<td>&emsp;<b><%=info.get(0).getMaths()%></b></td>
		</tr>
		<tr>
			<th>Science</th>
			<td>&emsp;<b><%=info.get(0).getScience()%></b></td>
		</tr>
		<tr>
			<th>Computer Science</th>
			<td>&emsp;<b><%=info.get(0).getComputerScience()%></b></td>
		</tr>
		<tr>
			<th>Average</th>
			<td>&emsp;<b><%=info.get(0).getAverage()%></b></td>
		</tr>
		<tr>
			<th>Grade</th>
			<td>&emsp;<b><%=info.get(0).getGrade()%></b></td>
		</tr>
		
		<tr>
			<th><button action="action" onclick="window.history.go(-1);return false" type="submit">Back</button></th>
		</tr>
		<tr>
			<th><button type = "submit">Logout</button></th>
		</tr>
	</table>
	
	
	</form>
</body>
</html>