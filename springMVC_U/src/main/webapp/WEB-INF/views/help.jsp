<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Angad
  Date: 13-11-2024
  Time: 12:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=ISO-8859-1" language="java" pageEncoding="ISO-8859-1" %>
<%@page isELIgnored="false"%>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>help com.springmvc.service</title>
</head>
<body>


<% String sport = (String) request.getAttribute("sport");
    Integer id = (Integer) request.getAttribute("sportsId");
    LocalDateTime localDateTime = (LocalDateTime) request.getAttribute("now");
    List<Integer> integerList = (List<Integer>) request.getAttribute("list");
%>

<h1>spotr = <%= sport%></h1>
<h1>sports id  = <%= id%></h1>
<h1>time = <%=localDateTime%></h1>
<h1>no of players</h1>
<%
      for(Integer i : integerList){
%>
    <h1><%=i%></h1>
<%}%>
<%--<h1>sports = {@sport}</h1>
<h1>sports id  = {@id}</h1>
<h1>time = {@now}</h1>
<h1>no's = {@list}</h1>
<h1>how are you</h1>
<h1>/about</h1>--%>
</body>
</html>
