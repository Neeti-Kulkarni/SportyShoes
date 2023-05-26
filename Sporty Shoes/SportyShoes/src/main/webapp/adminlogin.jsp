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
  color:DarkRed;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome Admin</h1>
<form action="insertadmin">
<table>
<tr><td>Username:</td><td><input type="text" name="adusnm"></td></tr>
<tr><td>Password:</td><td><input type="password" name="adpass"></td></tr>
<tr><td><input type="submit" value="Login"></td></tr>
</table>
</form>
</body>
</html>