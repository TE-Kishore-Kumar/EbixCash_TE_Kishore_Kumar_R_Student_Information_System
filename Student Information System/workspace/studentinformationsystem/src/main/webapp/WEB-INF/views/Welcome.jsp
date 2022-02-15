<%@page import="com.ebix.studentinformationsystem.beans.StudentInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
	StudentInfo info = (StudentInfo) request.getAttribute("user");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="preconnect" href="https://fonts.gstatic.com">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;500;600&display=swap" rel="stylesheet">
<title>Welcome</title>
<style type="text/css">
<%@include file="welcome.css" %>
</style>
</head>
<body>
<div class="background">
        <div class="shape"></div>
        <div class="shape"></div>
    </div>
    <table>
    <%
 	if(info != null){
%>
<tr><th><h3 style="text-align: center;"> Welcome <%= info.getName() %></h3></th></tr>
<%
 	}
%>
<tr><th><a href="./showdata"><button>Show Details</button></a></th></tr>
<tr><th><a href="./subjects"><button>Subjects</button></a></th></tr>
</table>
</body>
</html>