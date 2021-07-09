<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h2>login successful</h2>
 		<h3>Welcome ${sessionScope.username}</h3>
 		<br>
 		<a href = "product">Browse All Products</a><br><br>
 		<a href = "product">Browse List of All Users</a><br><br>
 		<a href = "product">See Purchase Report</a><br><br>
 		<h2><a href="${pageContext.request.contextPath}/account/logout">logout</a></h2>
 		
 		<%@include file='footer.html' %>
</body>
</html>