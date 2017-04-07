<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List of countries</title>
</head>
<body bgcolor="wheat">

<style>
table, th, td {
    border: 1px solid black;
    padding: 5px;
}
</style>
<table width="30%" style="color:red">
	<th colspan="7">Country Details</th>
	
	<tr><td><b>ID</b></td><td><b>Name</b></td></tr>
		<c:forEach var="temp" items="${countries}">
	
	<tr><td>${temp.id}</td>
	<td><a href="<c:url value='details?id=${temp.id}'/>">${temp.name}</a></td></tr>
	
	</c:forEach>
</table><br>
<center>${msg}</center>
<br>

<a href="addcountry.jsp"><input type="button" value="click here to add country"></a>


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