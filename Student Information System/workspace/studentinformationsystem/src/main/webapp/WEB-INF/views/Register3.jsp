<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%
    	String err = (String) request.getAttribute("err");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Year III Register</title>
<style type="text/css">
<%@include file="register3.css" %>
</style>
</head>
<body>

<div class="background">
        <div class="shape"></div>
        <div class="shape"></div>
    </div>
    <form action="./register3" method="post">
    <% if(err != null && !err.isEmpty()){ %>
	<h2 style="color: red"><%= err %></h2>
<%} %>
        <h3>Register Here</h3>
        
        <label for="rollNumber">RollNumber</label>
        <input type="number" placeholder="Roll Number" id="rollNumber" name="rollNumber" required="required" >
                
        <label for="engineeringGraphics">Engineering Graphics</label>
        <input type="number" placeholder="Engineering Graphics Mark" id="engineeringGraphics" name="engineeringGraphics" >
        
        <label for="engineeringMechanics">Engineering Mechanics</label>
        <input type="number" placeholder="Engineering Mechanics Mark" id="engineeringMechanics" name="engineeringMechanics" >
        
        <label for="autoCAD">Auto CAD</label>
        <input type="number" placeholder="Auto CAD Mark" id="autoCAD" name="autoCAD" >

        <label for="creo">CREO</label>
        <input type="number" placeholder="CREO Mark" id="creo" name="creo" >
    
    	<label for="ansys">ANSYS Lab</label>
        <input type="number" placeholder="ANSYS Mark" id="ansys" name="ansys" >
    
        <button type="submit">Register</button>
    </form>
</body>
</html>