
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>demo</title>
</head>
<body>


  	<form action="print">
	Enter name ::	<input type="text" name="name"> <br>
	Enter Desig ::	<input type="text" name="desig"> <br>
		<input type="submit" value="print"> | <input type="reset">
	</form> 
	
	
	<table border : "10px solid red">
	<thead>
	
	<tr>
	<th>Id</th>
	<th>Name</th>
	<th>Designation</th>
	<th>delete</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${all}" var = "list">
	
	<tr><td>${list.id}</td>
	<td>${list.name}</td>
	<td>${list.desig}</td></tr>
	<td><a href="delete/${list.id}">delete</a></td>
	
	</c:forEach>
	
	</table>
	
	<!--  	<form action="add">
	Enter name ::	<input type="text" name="name"> <br>
	Enter Desig ::	<input type="text" name="desig"> <br>
		<input type="submit" value="print"> | <input type="reset">
	</form>  -->

</tbody>

</body>
</html>