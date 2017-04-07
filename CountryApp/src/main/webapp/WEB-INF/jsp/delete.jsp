<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="wheat">

<style>
table, th, td {
    border: 1px solid black;
    padding: 5px;
}
</style>

<table width="25%" >
	<th colspan="2">Countries</th>
	
	<tr><td><b>ID</b></td><td><b>Name</b></td>
	
		<c:forEach var="temp" items="${countries}">
	
	<tr><td>${temp.id}</td>
	<td>${temp.name}</td></tr>
	
	</c:forEach>
</table>

<br><br>


<form action="deleteId">
Enter Id to Delete:<input type="number" name="id">
<input type="submit" value="delete by ID">
</form>

<br><br>

<form action="deleteName">
Enter Name to Delete:<input type="text" name="name">
<input type="submit" value="delete by NAME">
</form>

</body>
</html>