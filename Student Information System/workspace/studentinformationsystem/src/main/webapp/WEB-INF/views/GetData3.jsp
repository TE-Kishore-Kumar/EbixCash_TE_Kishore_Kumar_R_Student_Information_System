<%@page import="com.ebix.studentinformationsystem.beans.StudentInfo3"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
	List<StudentInfo3> info3 = (List<StudentInfo3>) request.getAttribute("data");
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
<%@ include file ="getdata3.css" %>
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
			<td>&emsp;&emsp;&emsp;&emsp;<b><%=info3.get(0).getRollNumber()%></b></td>
		</tr>
		<tr>
			<th>Engineering Graphics</th>
			<td>&emsp;&emsp;&emsp;&emsp;<b><%=info3.get(0).getEngineeringGraphics()%></b></td>
		</tr>
		<tr>
			<th>Engineering Mechanics</th>
			<td>&emsp;&emsp;&emsp;&emsp;<b><%=info3.get(0).getEngineeringMechanics()%></b></td>
		</tr>
		<tr>
			<th>Auto CAD</th>
			<td>&emsp;&emsp;&emsp;&emsp;<b><%=info3.get(0).getAutoCAD()%></b></td>
		</tr>
		<tr>
			<th>CREO</th>
			<td>&emsp;&emsp;&emsp;&emsp;<b><%=info3.get(0).getCreo()%></b></td>
		</tr>
		<tr>
			<th>ANSYS</th>
			<td>&emsp;&emsp;&emsp;&emsp;<b><%=info3.get(0).getAnsys()%></b></td>
		</tr>
		<tr>
			<th>Average</th>
			<td>&emsp;&emsp;&emsp;&emsp;<b><%=info3.get(0).getAverage3()%></b></td>
		</tr>
		<tr>
			<th>Grade</th>
			<td>&emsp;&emsp;&emsp;&emsp;<b><%=info3.get(0).getGrade3()%></b></td>
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