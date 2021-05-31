<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Customers</title>
</head>
<body>
	
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