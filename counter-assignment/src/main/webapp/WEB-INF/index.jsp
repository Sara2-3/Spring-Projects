<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p> You have visited this page <c:out value="${numerues}"/> times </p>
<a href="http://localhost:8080/">Test Another Visit</a>
<form action="/resetCounter" method="post" style="margin-top: 10px">
    <button type="submit">Reset Counter</button>
</form>

</body>
</html>
