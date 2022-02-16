<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    	String err = (String) request.getAttribute("err");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Year I Register</title>
<style type="text/css">
<%@include file="register.css" %>
</style>
</head>
<body>

<div class="background">
        <div class="shape"></div>
        <div class="shape"></div>
    </div>
    <div class="background1">
        <div class="shape1"></div>
        <div class="shape1"></div>
    </div>
    <form action="./register" method="post">
    <% if(err != null && !err.isEmpty()){ %>
	<h2 style="color: red"><%= err %></h2>
<%} %>
        <h3>Register Here</h3>

        <label for="rollNumber">Roll Number</label>
        <input type="number" placeholder="Roll Number" id="rollNumber" name="rollNumber" required="required">

        <label for="name">Name</label>
        <input type="text" placeholder="Name" id="name" name="name" required="required">

        <label for="password">Password</label>
        <input type="password" placeholder="Password" id="password" name="password" required="required">
        
        <label for="bloodGroup">Blood Group</label>
        <input type="text" placeholder="Blood Group" id="bloodGroup" name="bloodGroup" required="required">
        
        <label for="english">English</label>
        <input type="number" placeholder="English Mark" id="english" name="english" >
        
        <label for="maths">Maths</label>
        <input type="number" placeholder="Maths Mark" id="maths" name="maths" >
        
        <label for="science">Science</label>
        <input type="number" placeholder="Science Mark" id="science" name="science" >

        <label for="computerScience">Computer Science</label>
        <input type="number" placeholder="Computer Science Mark" id="computerScience" name="computerScience" >
    
    	<label for="physicalExercise">Physical Exercise</label>
        <input type="number" placeholder="Physical Exercise Mark" id="physicalExcercise" name="physicalExcercise" >
    
        <button type="submit">Register</button>
        
		
    </form>
</body>
</html>