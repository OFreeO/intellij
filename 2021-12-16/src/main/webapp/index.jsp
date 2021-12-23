<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%!
   public void doA(){
       System.out.println("test");
   }
%>
<%
    doA();
    doA();
%>
<h1><%= "Hello World!" %>
    <%out.print("Hello World!");%>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a><br>
<a href="Myservlet">My Servlet</a>
<form action="submit.jsp" method="post">
    몇단으로 할래?
    <input type="text" name="aa" value="">
    <input type="submit" value="전송">
</form>
</body>
</html>