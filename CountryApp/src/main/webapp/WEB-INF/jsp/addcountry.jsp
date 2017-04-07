<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add new country</title>
</head>
<body bgcolor="wheat">

<br><br><br><br>
<b>Add new Country</b><br>

<table>
<form action="addCountry" method="post">

<tr><td>Country Code:</td><td><input type="number" name="countryCode" placeholder="country id"></td></tr>
<tr><td>Country Name:</td><td><input type="text" name="name" placeholder="country name"></td></tr>
<tr><td>Country Area:</td><td><input type="number" name="area" placeholder="country area"></td></tr>
<tr><td>Population:</td><td><input type="number" name="population" placeholder="country population"></td></tr>
<tr><td>Currency:</td><td><input type="text" name="currency" placeholder="country currency"></td></tr><br><br>

</table>
<input type="submit" value="Add">
</form>
</body>
</html>