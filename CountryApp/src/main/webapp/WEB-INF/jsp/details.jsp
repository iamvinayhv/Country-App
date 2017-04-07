<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.bridgelabz.CountryApp.model.Country" import="java.util.*"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Countries and Details</title>
</head>
<body bgcolor="wheat">
<style>
table, th, td {
    border: 1px solid black;
    padding: 5px;
}
</style>


<table width="50%" style="color:red">
	<th colspan="7">Country Details</th>
	
	<tr>
	<td><b>ID</b></td><td>${country.getId()}</td>
	</tr>
	
	<tr>
	<td><b>Country Code</b></td><td>${country.getCountryCode()}</td>
	</tr>
	
	<tr>
	<td><b>Name</b></td><td>${country.getName()}</td>
	</tr>
	
	<tr>
	<td><b>Area (in sqKm)</b></td><td>${country.getArea()}</td>
	</tr>
	
	<tr>
	<td><b>Population (in b)</b></td><td>${country.getPopulation()}</td>
	</tr>
	
	<tr>
	<td><b>Last Update</b></td><td>${country.getDate()}</td>
	</tr>
	
	<tr>
	<td><b>Currency</b></td><td>${country.getCurrency()}</td>
	</tr>
	
</table><br>
<center>${msg}</center>
<br>


<a href="home.jsp"><input type="button" value="Back to home page!!!"></a>

<form action="listOfcountry" method="get">
<input type="submit" value="click to see country list">
</form>

<form action="delete">
<input type="submit" value="click here to delete country">
</form>

<form action="forupdate">
<input type="submit" value="click here to update country details">
</form>

<form action="view" method="post">
<input type="submit" value="click to view all countries and there details">
</form>

</body>
</html>