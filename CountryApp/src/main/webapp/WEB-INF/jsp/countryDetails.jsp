<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.bridgelabz.CountryApp.model.Country"%>
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
<table width="100%" style="color:red">
	<th colspan="7">Country Details</th>
	
	<tr><td><b>ID</b></td><td><b>Country Code</b></td><td><b>Name</b></td><td><b>Area (in sqKm)</b></td><td><b>Population (in b)</b></td><td><b>Last Update</b></td><td><b>Currency</b></td></tr><br/>
		<c:forEach var="temp" items="${countries}">
	
	<tr><td>${temp.id}</td>
	<td>${temp.countryCode}</td>
	<td><a href="<c:url value='details?id=${temp.id}'/>">${temp.name}</td></a>
	<td>${temp.area}</td>
	<td>${temp.population}</td>
	<td>${temp.date}</td>
	<td>${temp.currency}</td></tr>
	
	</c:forEach>
</table><br>
<center>${msg}</center>
<br>

<form action="listOfcountry" method="get">
<input type="submit" value="click to see country list">
</form>
<a href="addcountry.jsp"><input type="button" value="click here to add country"></a>
<br>

<form action="delete">
<input type="submit" value="click here to delete country">
</form>

<form action="forupdate">
<input type="submit" value="click here to update country details">
</form>


</body>
</html>