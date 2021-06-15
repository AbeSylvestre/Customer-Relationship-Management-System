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
	
	<div id="table-container">
		<div>
			<table id="customer-table">
				<thead>
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="customer" items="${customerList}">
						<tr>
							<td> ${customer.firstName}</td>
							<td> ${customer.lastName}</td>
							<td> ${customer.email}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</body>
</html>