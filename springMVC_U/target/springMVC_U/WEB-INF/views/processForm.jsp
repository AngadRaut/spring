<%@ page import="java.util.List" %>
<%@ page import="com.springmvc.entity.User" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Spring MVC Example</title>
</head>
<body>
<h2>Hello World!</h2>
<h1>this is home page</h1>
<h1>called by home com.springmvc.controller</h1>
<h1>/process </h1>

<%
    User us = (User) request.getAttribute("user");
%>
<h1>user = <%=us.toString()%></h1>
<%--<%
    String name = (String) request.getAttribute("mail");
    String integer = (String) request.getAttribute("name");
    String frnd = (String) request.getAttribute("pass");
%>
<h1>name is = <%=name%></h1>
<h1>id is = <%=integer%></h1>
<h1>friends = <%=frnd%></h1>--%>

</body>
</html>
