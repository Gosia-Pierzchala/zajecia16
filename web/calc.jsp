<%--
  Created by IntelliJ IDEA.
  User: mkalinow
  Date: 23-Aug-18
  Time: 7:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Kalkulator</title>
</head>
<body>
<h1>Wynik dodawania</h1>
<%
    int x = Integer.valueOf(request.getParameter("x"));
    int y = Integer.valueOf(request.getParameter("y"));
    int sum = x + y;
%>
<h2> <%= x + " + " + y + " = " + sum%></h2>
</body>
</html>
