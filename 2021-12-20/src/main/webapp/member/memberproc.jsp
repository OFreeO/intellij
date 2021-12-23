<%--
  Created by IntelliJ IDEA.
  User: KB
  Date: 2021-12-20
  Time: 오전 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.example._20211220.dto.Member" %>
<%@ page import="com.example._20211220.dao.MemberDao" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="m1" class="com.example._20211220.dto.Member"></jsp:useBean>
<jsp:setProperty name="m1" property="*"></jsp:setProperty>
<%
//    String email = request.getParameter("email");
//    String pwd = request.getParameter("pwd");
//    String gender = request.getParameter("gender");
//    Java Bean...클래스..
//    Member m1 = new Member(); 위에 <jsp:useBean와 동일한 기능>
//    m1.setEmail(email);
//    m1.setPwd(pwd);
//    m1.setGender(gender); 위에 <jsp:setProperty 와 동일한 기능>

    MemberDao md = new MemberDao();

    md.insertmember(m1);
%>
<%--<%=email%>--%>
<%--<%=pwd%>--%>
<%--<%=gender%>--%>
<br>
<%=m1%>
</body>
</html>
