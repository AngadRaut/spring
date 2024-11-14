<%@ page import="java.util.List" %>

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
<h1>/home</h1>
<h1>Java Programming</h1>
       <%
           String name = (String) request.getAttribute("Name");
           Integer integer = (Integer) request.getAttribute("id");
           List<String> frnd = (List<String>) request.getAttribute("friends");
       %>
        <h1>name is = <%=name%></h1>
        <h1>id is = <%=integer%></h1>
         <h1>friends = </h1>

            <%
            for(String s : frnd){
            %>
               <h1><%= s %> </h1>
            <%
                }
            %>

       </body>
</html>
