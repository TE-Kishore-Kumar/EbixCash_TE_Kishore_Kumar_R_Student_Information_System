<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    	String err = (String) request.getAttribute("err");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Form</title>
<style type="text/css">
<%@include file="register.css" %>
</style>
</head>
<body>
<% if(err != null && !err.isEmpty()){ %>
	<h2 style="color: red"><%= err %></h2>
<%} %>
<div class="background">
        <div class="shape"></div>
        <div class="shape"></div>
    </div>
    <form action="./register" method="post">
        <h3>Register Here</h3>

        <label for="username">Roll Number</label>
        <input type="number" placeholder="Roll Number" id="rollNumber" name="rollNumber" required="required">

        <label for="username">Name</label>
        <input type="text" placeholder="Name" id="name" name="name" required="required">

        <label for="password">Password</label>
        <input type="password" placeholder="Password" id="password" name="password" required="required">
        
        <label for="password">Blood Group</label>
        <input type="text" placeholder="Blood Group" id="bloodGroup" name="bloodGroup" required="required">
        
        <label for="password">English</label>
        <input type="number" placeholder="English Mark" id="english" name="english" required="required">
        
        <label for="password">Maths</label>
        <input type="number" placeholder="Maths Mark" id="maths" name="maths" required="required">
        
        <label for="password">Science</label>
        <input type="number" placeholder="Science Mark" id="science" name="science" required="required">

        <label for="password">Computer Science</label>
        <input type="number" placeholder="Computer Science Mark" id="computerScience" name="computerScience" required="required">
    
        <button type="submit">Register</button>
    </form>
</body>
</html>