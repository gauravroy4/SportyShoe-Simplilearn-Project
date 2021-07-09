<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>User Login Page</h2>
	${error }
	<form method="post"
		action="${pageContext.request.contextPath }/user/userLogin">
		<h3>Existing User Login</h3>
		<table border="0" cellpadding="2" cellspacing="2">
			<tr>
				<td>Username</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" value="Login"></td>
			</tr>
		</table>
		<a href="newUser">SignUp</a>
	</form>
	
	
</body>
</html>