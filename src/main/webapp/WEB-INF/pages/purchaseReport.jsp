<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		<div align="center">
		<h1>Purchase Report</h1>
		<h3>Filter by</h3>&nbsp;&nbsp; <a href="filterByDate">date</a> &nbsp;&nbsp;  <a href="filterByCategory">category</a>
		<br><br><br>
		<table border="1">

			<th>Purchase Id</th>
			<th>PurchasedBy</th>
			<th>Product Id</th>
			<th>Category</th>
			<th>Date of Purchase</th>

			<c:forEach var="report" items="${listReport}">
				<tr>

					<td>${report.reportId}</td>
					<td>${report.purchasedBy}</td>
					<td>${report.productId}</td>
					<td>${report.category}</td>
					<td>${report.purchaseDate}</td>

				</tr>
			</c:forEach>
		</table>
		<h4>
			Goto Product List <a href="product">here</a>
		</h4>
	</div>
	
	<%@include file='footer.html' %>
		
</body>
</html>