<%--
  Created by IntelliJ IDEA.
  User: mkalinow
  Date: 23-Aug-18
  Time: 7:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodawanie</title>
</head>
<body>
<h1>Wynik dodawania</h1>
<%
    int number = Integer.valueOf(request.getParameter("number"));
    int sum = 0;
%>
    <h2>
        <%
    for (int i = number; i >= 0; i--) {
        sum = sum + i;
        if(i == 0){
            out.print(i);
        } else
        out.print(i + " + ");
    }
    out.print(" = " + sum);
%>
    </h2>

</body>
</html>
