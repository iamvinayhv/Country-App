<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update Country Details</title>
</head>
<body bgcolor="wheat">


<table width="25%" border="1px solid black">
<tr>	<th colspan="3">Countries</th></tr>
	
	<tr><td><b>Country ID</b></td><td><b>Country Code</b></td><td><b>Name</b></td>
	
	<c:forEach var="temp" items="${countries}">
	
		<tr><td>${temp.id}</td>
		<td>${temp.countryCode}</td>
		<td>${temp.name}</td></tr>
		
	
	</c:forEach>
	
</table>

<br><br><br>

<form action="update" method="post">
<table>
<caption><b>Update Details</b></caption>
<tr><td>Country ID:</td><td><input type="number" name="id" placeholder="country id"></td></tr>
<tr><td>Country Code:</td><td><input type="number" name="countryCode" placeholder="country id"></td></tr>
<tr><td>Country Name:</td><td><input type="text" name="name" placeholder="country name"></td></tr>
<tr><td>Country Area:</td><td><input type="number" name="area" placeholder="update area"></td></tr>
<tr><td>Population:</td><td><input type="number" name="population" placeholder="update population"></td></tr>
<tr><td>Currency:</td><td><input type="text" name="currency" placeholder="pudate currency"></td></tr>

</table><br>
<input type="submit" value="Update">
</form>
</body>
</html>