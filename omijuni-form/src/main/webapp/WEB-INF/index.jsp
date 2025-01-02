<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<h1> Send an Omikuji</h1>
<div class="box">
    <form action="/show" method="post">
       <label> Pick any number from 5 to 25</label><br><br>
        <input type="number" id="number" name="number" min="5" max="25" required><br><br>
        <label>Enter the name of any city.</label><br><br>
        <input type="text" name="city"><br><br>
        <label>Enter the name of any real person</label><br><br>
        <input type="text" name="person"><br><br>
        <label>Enter professional endeavor or hobby</label><br><br>
        <input type="text" name="hobby"><br><br>
        <label>Enter any type of living thing</label><br><br>
        <input type="text" name="living"><br><br>
        <label>Say something nice to someone</label><br><br>
        <textarea name="comment" cols="20" rows="3"></textarea><br><br>
        <label>Send and show a friend</label><br><br>
        <button>Send</button>
    </form>
</div>

</body>
</html>
