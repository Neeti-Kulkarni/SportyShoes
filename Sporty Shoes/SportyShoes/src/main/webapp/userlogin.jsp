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
h3 {
  text-align: center;
  font-family:verdana;
  font-size:200%;
  color:DarkBlue;
}
.button { 
height: 50px; 
width: 500px;
color:DarkBlue;
font-size:250%;
background-color:CornSilk;
font-family:Brush Script MT;
} 
</style>
<meta charset="ISO-8859-1">
<title>User Details</title>
</head>
<body>
<h1>Welcome User</h1>

<h3><i>"LogIn"</i></h3>
<form action="loginuser">
<table>
<tr><td>Username:</td><td><input type="text" name="uusnm"></td></tr>
<tr><td>Password:</td><td><input type="text" name="upass"></td></tr>
<tr><td><input type="submit" class="button" value="Log In"></td></tr>
</table>
</form><hr>

<h3><i>"Sign Up"</i></h3>
<form action="insertuser">
<table>
<tr><td>First_name:</td><td><input type="text" name="fname"></td></tr>
<tr><td>Last_Name:</td><td><input type="text" name="lname"></td></tr>
<tr><td>Date Of Birth:</td><td><input type="text" name="dob"></td></tr>
<tr><td>Username:</td><td><input type="text" name="uusnm"></td></tr>
<tr><td>Password:</td><td><input type="text" name="upass"></td></tr>
<tr><td><input type="submit" class="button"  value="Sign Up"></td></tr>
</table>
</form>
</body>
</html>