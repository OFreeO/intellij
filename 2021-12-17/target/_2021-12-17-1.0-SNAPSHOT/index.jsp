<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<form action="gugudan.jsp" method="get">
    구구단 <input type="text" name="gugudan"><br>
    aaa <input type="text" name="aaa"><br>
    <input type="submit" value="전송">
</form>
<h1>request 사용해보기</h1>
<a href="request_befo.jsp">request_befo</a>
<h1>response사용해보기</h1>
<a href="response.jsp?send=true">바로 돌아오기</a><br>
<a href="response.jsp?send=flase">가보기</a>
<h1>session 사용해보기</h1>
<a href="sessionset.jsp">세션지정하기</a><br>
<a href="sessionget.jsp">세션값확인하기</a>
<h1>회원가입하기</h1>
<a href="Login.jsp">회원가입</a>

<%--
    memberform.jsp ->member
--%>
</body>
</html>