<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
h2 {
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
<h2>Insert A New Shoe Detail</h2>
<form action="insertshoe">
<table>
<tr><td>Shoe_ID:</td><td><input type="number" name="shid"></td></tr>
<tr><td>Shoe_Name:</td><td><input type="text" name="shname"></td></tr>
<tr><td>Shoe_Price:</td><td><input type="number" name="shprice"></td></tr>
<tr><td><div style="text-align:center"><input type="submit" class="button" value="Insert"></div></td></tr>
</table>
</form><br>
<h2>Display/Edit Shoes</h2>
<form action="showshoesadmin">
<div style="text-align:center">  
    <input type="submit" class="button" value="Show All">  
</div> 
</form> 
<br><br>
<h2>Show All Users</h2>
<form action="displayalluser">
<div style="text-align:center">
<input type="submit" class="button" value="Show Users">
</div>
</form>

</body>
</html>