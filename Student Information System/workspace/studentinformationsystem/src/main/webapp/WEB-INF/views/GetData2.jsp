<%@page import="com.ebix.studentinformationsystem.beans.StudentInfo2"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
	List<StudentInfo2> info2 = (List<StudentInfo2>) request.getAttribute("data");
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
<%@ include file ="getdata2.css" %>
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
			<td>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<b><%=info2.get(0).getRollNumber()%></b></td>
		</tr>
		<tr>
			<th>HMT</th>
			<td>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<b><%=info2.get(0).getHmt()%></b></td>
		</tr>
		<tr>
			<th>FMM</th>
			<td>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<b><%=info2.get(0).getFmm()%></b></td>
		</tr>
		<tr>
			<th>English</th>
			<td>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<b><%=info2.get(0).getMechatronics()%></b></td>
		</tr>
		<tr>
			<th>Maths</th>
			<td>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<b><%=info2.get(0).getFop()%></b></td>
		</tr>
		<tr>
			<th>Science</th>
			<td>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<b><%=info2.get(0).getFmmLab()%></b></td>
		</tr>
		<tr>
			<th>Average</th>
			<td>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<b><%=info2.get(0).getAverage2()%></b></td>
		</tr>
		<tr>
			<th>Grade</th>
			<td>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<b><%=info2.get(0).getGrade2()%></b></td>
		</tr>
		<tr>
			<th><button action="action" onclick="window.history.go(-1);return false" type="submit">Back</button></th>
		</tr>
		
		<tr>
			<th><button>Logout</button></th>
		</tr>
	</table>
	
	
	</form>
</body>
</html>