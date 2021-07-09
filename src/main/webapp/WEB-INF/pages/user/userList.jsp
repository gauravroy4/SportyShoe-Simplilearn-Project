<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List of Users</title>
</head>
<body>

	<div align="center">
		<h1>User List</h1>

		<table border="1">

			<th>User Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<c:forEach var="user" items="${listUser}">
				<tr>

					<td>${user.id}</td>
					<td>${user.firstName}</td>
					<td>${user.lastName}</td>
					<td>${user.email}</td>

				</tr>
			</c:forEach>
		</table>
	</div>
	
	<br><br><br><br>
	
	<div align="center">
	<form action="/searchUser">
		<label for="email">Search User by Email:</label> <br>
		<input type="email" id="email" name="email" placeholder="Enter User emailId"><br><br>
		<input type="submit" value="Submit">
	</form>
	</div>
	
	<%@include file='footer.html' %>
</body>
</html>