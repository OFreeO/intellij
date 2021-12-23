<%--
  Created by IntelliJ IDEA.
  User: KB
  Date: 2021-12-17
  Time: 오후 4:27
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
    String ID = request.getParameter("ID");
    String PW = request.getParameter("PW");
    String G = request.getParameter("gender");
    String H = request.getParameter("checkbox");

    out.println(ID,PW,G,H);

%>
</body>
</html>
