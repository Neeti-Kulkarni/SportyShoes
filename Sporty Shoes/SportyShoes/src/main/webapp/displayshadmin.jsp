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
  font-size:300%;
}
}
.button { 
height: 50px; 
width: 500px;
color:Crimson;
font-size:250%;
font-family:Lucida Console;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Shoes Details</h1>

<%List<Shoes> e=(List<Shoes>)request.getAttribute("list"); %>

<table border="1">
<tr><th>Shoe_ID</th><th>Shoe Name</th><th>Shoe Price</th></tr>

<%for(Shoes es:e){%>
<tr><td><%=es.getSh_id()%></td><td><%=es.getSh_name()%></td><td><%=es.getSh_price()%></td><td>
<form action="deleteshoe">
<input type="hidden" name="shid" value=<%=es.getSh_id() %>>
<input type="submit" class="button" value="Delete">
</form></td>
<td>
<form action="editshoe1.jsp">
<input type="hidden" name="shid" value=<%=es.getSh_id() %>>
<input type="submit" class="button" value="Edit">
</form></td>
</tr>
<%}%>
</table>
<br><br>

</body>
</html>