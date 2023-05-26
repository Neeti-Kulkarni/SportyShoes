<%@page import="com.example.demo.model.BankDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
h1 {
  text-align: center;
  font-family:verdana;
  font-size:300%;
  color:DarkBlue;
}
.button { 
height: 80px; 
width: 500px;
color:DarkRed;
font-size:250%;
background-color:CornSilk;
font-family:Brush Script MT;
} 
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Redirecting to your Bank...</h1>

<form action="proceedpay">
<table>
<tr><td>Enter bank ID(1 or 2):</td><td><input type="number" name="bid"></td></tr>
</table>
<input type="hidden" name="shprice" value=<%=request.getParameter("shprice") %>>
<input type="hidden" name="shname" value=<%=request.getParameter("shname") %>>
<input type="hidden" name="uusnm" value=<%=request.getParameter("uusnm") %>>
<input type="submit" class="button" value="Proceed To Pay">

</form>
</body>
</html>