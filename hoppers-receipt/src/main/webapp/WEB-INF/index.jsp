<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 28/11/2024
  Time: 22:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Customer Name:<c:out value="${name}"/> <c:out value="${surname}"/></h1>
<h4>Item name: <c:out value="${itemName}"/></h4>
<h4> Price : <c:out value="${price}"/></h4>
<h4> Description : <c:out value="${description}"/></h4>
<h4> Vendor : <c:out value="${vendor}"/></h4>

</body>
</html>
