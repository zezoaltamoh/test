<%@ taglib uri="/WEB-INF/lib/spring-form.tld" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Here</title>

<!-- Latest compiled CSS -->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css" />

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</head>
	<style>
		p.pos_fixed {
   		 position: fixed;
   		 top: 15px;
   		 right: 15px;
   		 color: red;
		}
	</style>
<body>
	<p class= "pos_fixed"> <a href="/REMS/goHome">Home</a></p>
	
	<%@include file = "header.jsp" %>
	
	<h2>Orders Per Supplier</h2>
	
   		 <table class="table table-hover">
   		 	<tr><th>Order Id</th><th> Description</th><th> Status</th><th> State</th><th> City</th><th> Address</th><th> Zip Code</th>
   		 	<th> Track Number</th><th> Return Date</th><th> Order Date</th><th> Arrival Date</th><th> Equipment ID</th>
<!--    		 	<th> Feedback</th><th> Researcher ID</th><th> Supplier ID</th> -->
   		 	</tr>
			 <c:forEach var="listValue" items="${myOrders}">
			 	
				<tr>
					
 					<td>${listValue.id}</td>
					<td> ${listValue.description}</td>
					<td> ${listValue.status}</td>
					<td> ${listValue.state}</td>
					<td> ${listValue.city}</td>
					<td>${listValue.address}</td>
					<td> ${listValue.zipCode}</td>
					<td> ${listValue.trackingNumber}</td>
					<td> ${listValue.returnDate}</td>
					<td> ${listValue.orderDate}</td>
					<td> ${listValue.arrivalDate}</td>
					
					 <td> ${listValue.equipment.id}</td>
<%-- 					<td> ${listValue.feedback}</td> --%>
<%-- 					<td> ${listValue.researcher}</td> --%>
					
				</tr>
			 </c:forEach>
   		 </table>
	
</body>
</html>