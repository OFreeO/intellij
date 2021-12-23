<%--
  Created by IntelliJ IDEA.
  User: KB
  Date: 2021-12-17
  Time: 오전 9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
    String a = request.getParameter("gugudan");
    out.println("a = " + a+"<br>");
    int dan = Integer.parseInt(a);

    String b = request.getParameter("aaa");
    out.println("b = " + b+"<br>");
    String c = request.getParameter("ccc");
    out.println("c = " + c+"<br>");
%>
<%= "<p>"%>
<%
    for(int i = 1 ; i <= 9; i++)
        out.println(dan+"*"+i+"="+dan*i+"<br>");
%>
<%= "</p>"%>

</body>
</html>
