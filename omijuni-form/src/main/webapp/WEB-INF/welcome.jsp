<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<h1> Here's Your Omikunji</h1>
<div class="blue">
 <h3>In <c:out value="${number}"/> years,you will live in <c:out value="${city}" />
    with <c:out value="${person}"/> as your roommate <c:out value="${hobby}"/> for a living.
     The next time you see a <c:out value="${living}"/> you will have good luck.
     Also<c:out value="${comment}"/>
 </h3>

</div>
<a href="http://localhost:8080/">Go Back</a>

</body>
</html>
