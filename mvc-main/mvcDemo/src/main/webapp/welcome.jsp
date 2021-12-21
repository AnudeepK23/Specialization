<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>demo</title>
</head>
<body>


<h2>Hi Welcome ${username} </h2>


<hr>
<h2>Hi enter employee details </h2>
<h2>


<form action ="save" method="post">


<table>
<tr>
<td>
Enter Id ::<input type="number" name="id" value="${id}" >
</td>

</tr>

<tr>

<td>Enter Name<input type="text" name="name"></td>
</tr>
<tr>
<td>Enter  designation ::<input type="text" name="desig"></td>
</tr>
<tr>
<td>
<input type="submit" value="save"></td>
</tr>

</table>
</form>
</h2>

<h3>Employee records</h3>

<table bgcolor ="red">
	<thead>
	
	<tr>
	<th>Id</th>
	<th>Name</th>
	<th>Designation</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${all}" var = "list">
	
	<tr><td>${list.id}</td>
	<td>${list.name}</td>
	<td>${list.desig}</td></tr>
	
	</c:forEach>
	</tbody>
	
	</table>
	



</body>

</html>