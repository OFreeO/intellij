<%--
  Created by IntelliJ IDEA.
  User: KB
  Date: 2021-12-17
  Time: 오후 12:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="check.jsp" method="get">

    <p>아이디</p>
    <input type="text" name="ID" value="ID"><br>
    <p>비밀번호</p>
    <input type="text" name="PW" value="PW"><br>
    <p>비밀번호 확인</p>
    <input type="text" name="PW_re" value="PW"><br>
    <p>성별</p>
    <input type="radio" name="gender" value="male">남자<br>
    <input type="radio" name="gender" value="female">여자<br>
    <p>취미</p>
    <input type="checkbox" name="hobby" value="ex">운동<br>
    <input type="checkbox" name="hobby" value="game">게임<br>
    <input type="checkbox" name="hobby" value="C">코딩<br>
    <input type="checkbox" name="hobby" value="movie">영화<br>

    <input type="submit" value="전송">
</form>
</body>
</html>
