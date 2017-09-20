<%-- 
    Document   : index
    Created on : Sep 18, 2017, 8:20:58 AM
    Author     : 679810
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Week 2 Lab 1</title>
    </head>
    <body>
        <h1>Age next birthday</h1>
        <div>
        <form action="index" method="GET">
        Enter your current age: 
        <input type="text" name="inputBox" value="${currentAge}">
        <input type="submit" value="Age Next Birthday">
        </div>
        <br>
        ${updatedAge}
    </body>
</html>
