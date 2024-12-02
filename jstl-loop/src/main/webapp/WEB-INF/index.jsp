<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Fruit Loop</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
    <script type="text/javascript" src="/js/script.js"></script>
</head>
<body>
<div name="Store">
    <h1> Fruit Store </h1>
    <table>
        <thead>
            <th>Name</th>
            <th>Price</th>
        </thead>
        <tbody>
        <c:forEach var="item" items="${vegetables}">
        <tr>
            <td><c:out value="${item.name}"/> </td>
            <td><c:out value="${item.price}"/> </td>
        </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
