<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style> 
.button { 
height: 50px; 
width: 500px;
color:Crimson;
font-size:250%;
background-color:CornSilk;
font-family:Brush Script MT;
} 
h1 {
  text-align: center;
  font-family:verdana;
  font-size:300%;
  color:DarkRed;
}
h2 {
  text-align: center;
  font-family:verdana;
  font-size:200%;
  color:DarkRed;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><br>
<h1>
<%=request.getAttribute("s") %>

</h1>
<form action="displayshoeuser">
<input type="hidden" name="uusnm" value=<%=request.getAttribute("username") %>>
<input type="submit" class="button" value="Display All Shoes">
</form>
</body>
</html>