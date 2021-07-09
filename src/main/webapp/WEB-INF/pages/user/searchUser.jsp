<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<div align="center">
		<h1>Search User</h1>
		<form:form action="searchUser" method="post" modelAttribute="user">
			<table>

				<tr>
					<td>Enter User Email:</td>
					<td><form:input path="email" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Save"></td>
				</tr>
			</table>
		</form:form>
	</div>
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
	
	
</body>
</html>