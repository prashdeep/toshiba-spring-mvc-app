<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: classpath
  Date: 21-Nov-19
  Time: 3:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Assets</title>
    <style>
        .center {
            width: 60%;
            margin: 0 auto;
        }
    </style>
</head>
<body>

    <div  class="center">

        <c:forEach var="asset" items="${assets}">

        </c:forEach>
    </div>

</body>
</html>
