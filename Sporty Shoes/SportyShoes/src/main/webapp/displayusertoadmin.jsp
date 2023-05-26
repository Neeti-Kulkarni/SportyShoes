<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@page import="com.example.demo.model.*" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<style>
h1 {
  text-align: center;
  font-family:verdana;
  font-size:200%;
}
.button { 
font-style: italic;
height: 50px; 
width: 210px;
color:Crimson;
font-size:200%;
font-family:verdana;
 background-color:CornSilk;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Users Details</h1>

<%List<UserDetails> e=(List<UserDetails>)request.getAttribute("list"); %>

<table border="1">
<tr><th>First Name</th><th>Last Name</th><th>Date Of Birth</th><th>Username</th><th>Password</th></tr>
<%for(UserDetails es:e){%>
<tr><td><%=es.getF_name()%></td><td><%=es.getL_name()%></td><td><%=es.getDOB()%></td><td><%=es.getUsername()%></td><td><%=es.getPassword()%></td></tr>
<%} %>
</body>
</html>