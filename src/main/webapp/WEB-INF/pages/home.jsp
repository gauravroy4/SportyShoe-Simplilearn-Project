<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product Management Page</title>
<style>
.button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 16px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  transition-duration: 0.4s;
  cursor: pointer;
}
.button2 {
  background-color: white; 
  color: black; 
  border: 2px solid #008CBA;
}
.button2:hover {
  background-color: #008CBA;
  color: white;
}
</style>
</head>
<body>
	<div align="center">
		<h1>Product List</h1>
		
		<table border="1">

			<th>Name</th>
			<th>Photo</th>
			<th>Price</th>
			<th>Category</th>
			<th>Date Added</th>
			<th>Action</th>

			<c:forEach var="product" items="${listProduct}">
				<tr>

					<td>${product.name}</td>
					<td>${product.photo}</td>
					<td>${product.price}</td>
					<td>${product.category}</td>
					<td>${product.date}</td>
					<td><a href="editProduct?id=${product.id}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; 
						<a href="deleteProduct?id=${product.id}">Delete</a>
						<form action="/buyNow" method="get">
 								<button  class="button button2" type="submit">buy now</button>
						</form>
					</td>

				</tr>
			</c:forEach>
		</table>
		<h4>
			Add New Product <a href="newProduct">here</a>
		</h4>
	</div>
	
	<%@include file='footer.html' %>
</body>
</html>