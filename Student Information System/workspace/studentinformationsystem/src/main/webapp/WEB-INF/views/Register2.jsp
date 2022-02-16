<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%
    	String err = (String) request.getAttribute("err");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Year II Register</title>
<style type="text/css">
<%@include file="register2.css" %>
</style>
</head>
<body>

<div class="background">
        <div class="shape"></div>
        <div class="shape"></div>
    </div>
    <form action="./register2" method="post">
    <% if(err != null && !err.isEmpty()){ %>
	<h2 style="color: red"><%= err %></h2>
<%} %>
        <h3>Register Here</h3>
                
        <label for="rollNumber">RollNumber</label>
        <input type="number" placeholder="Roll Number" id="rollNumber" name="rollNumber" required="required" >
        
        <label for="hmt">HMT</label>
        <input type="number" placeholder="HMT Mark" id="hmt" name="hmt" >
        
        <label for="fmm">FMM</label>
        <input type="number" placeholder="FMM Mark" id="fmm" name="fmm" >
        
        <label for="mechatronics">Mechatronics</label>
        <input type="number" placeholder="Mechatronics Mark" id="mechatronics" name="mechatronics" >

        <label for="fop">FOP</label>
        <input type="number" placeholder="Fop Mark" id="fop" name="fop" >
    
    	<label for="fmmLab">FMM Lab</label>
        <input type="number" placeholder="FMM Lab Mark" id="fmmLab" name="fmmLab" >
    
        <button type="submit">Register</button>
        
    </form>
</body>
</html>