<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>List of Customers</title>
	
	<!-- References -->
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/crms.css" />
</head>
<body>
	
	<div id="header-container">
		<div id="header">
			<h2>CRMS - Customer Relationship Management System</h2>
		</div>
	</div>
	
	<!-- Add Customer -->
	<input type="button" value="Add Customer" onclick="window.location.href='customerForm';"
		class="add-button" />
	
	<!-- Customer table -->
	<div id="table-container">
		<div>
			<table id="customer-table">
				<thead>
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="customer" items="${customerList}">
					 
						<c:url var="updateLink" value="/customer/updateCustomer">
							<c:param name="customerId" value="${customer.id}" />
						</c:url>
						<c:url var="deleteLink" value="/customer/deleteCustomer">
							<c:param name="customerId" value="${customer.id}" />
						</c:url>
						
						<tr>
							<td>${customer.firstName}</td>
							<td>${customer.lastName}</td>
							<td>${customer.email}</td>
							<td><a href="${updateLink}">Update</a>
								| 
								<a href="${deleteLink}" onclick="return confirm('Are you sure you want to delete this customer?');">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</body>
</html>