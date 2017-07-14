<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: linhtran
  Date: 14/07/17
  Time: 09:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/login" method="post">

    <div class="lc-block">
        <div>
            <input type="text" class="style-4" name="username"
                   placeholder="User Name" />
        </div>
        <div>
            <input type="password" class="style-4" name="password"
                   placeholder="Password" />
        </div>
        <div>
            <input type="submit" value="Sign In" class="button red small" />
        </div>
        <c:if test="${param.error ne null}">
            <div class="alert-danger">Invalid username and password.</div>
        </c:if>
        <c:if test="${param.logout ne null}">
            <div class="alert-normal">You have been logged out.</div>
        </c:if>
    </div>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
</form>

</body>
</html>
