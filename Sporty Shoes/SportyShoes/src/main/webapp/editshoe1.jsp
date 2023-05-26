<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>

.button { 
height: 80px; 
width: 200px;
color:DarkBlue;
font-size:200%;
font-family:verdana;
} 
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="editshoe">
<table>
<tr><td><input type="hidden" name="shid" value=<%=request.getParameter("shid") %>></td></tr>
<tr><td>Edit Shoe Name:</td><td><input type="text" name="shname"></td></tr>
<tr><td>Edit Shoe Price:</td><td><input type="number" name="shprice"></td></tr>
<tr><td><input type="submit" class="button" value="Edit Now"></td></tr>
</table>
</form><br>
</body>
</html>