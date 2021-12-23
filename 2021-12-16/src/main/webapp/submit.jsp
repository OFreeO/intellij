<%--
  Created by IntelliJ IDEA.
  User: KB
  Date: 2021-12-16
  Time: 오후 12:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
서브밋jsp입니다.
<%--out request jsp 는 내장객체
    javascript document window Location    --%>
<%!
    request.setCharacterEncoding("utf-8");
    int dan = request.getParameter("aa");
%>
<%
    for(int i = 0; i<= 9; i++)
        out.println(dan * i);
%>

</body>
</html>
