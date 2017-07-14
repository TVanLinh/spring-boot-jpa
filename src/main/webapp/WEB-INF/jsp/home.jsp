<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
<head>
    <link href="<spring:url value="css/app.css" />" rel="stylesheet" type="text/css">
    <title>Spring Security Example - ProgrammingFree</title>
</head>
<body class="security-app">
    <h1>Home page</h1>
    ${user} ${requestScope.user}
<a href="/logout">Logout</a>
</body>
</html>
