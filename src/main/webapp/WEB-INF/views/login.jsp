<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 1/18/2023
  Time: 12:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Servlet</title>
</head>
<body>
<%--<%--%>
<%--    System.out.println( "name "+ request.getParameter("name"));--%>
<%--%>--%>

<%
    //    java.util.Date date = new java.util.Date();
    Date date = new Date();
%>
<p>Dummy Stuff from JSP and Get Parameter Value "name" : ${name} and "date" : <%=date%>
</p>
<br>
<p>and "password" : ${password}</p>
<br>
<%--valid user >> welcome.jsp--%>
<%--invalid user >> login.jsp--%>
<form action="/login.do" method="post">
    Enter your name <input type="text" name="name"/>
    Enter your name <input type="password" name="password"/>
    <input type="submit" value="Login"/>
</form>
<p style="color: crimson">${errorMsg}</p>
</body>
</html>
