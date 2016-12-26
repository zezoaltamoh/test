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
<body>
	
	<h2>Equipment List</h2>
	
		<%@include file = "header.jsp" %>
		
   		 <table class="table table-hover">
   		 	<thead>
   		 		<tr><th>Equipment ID</th><th> equipment Name</th><th> quantity</th><th> price</th><th> condition</th>
   		 		<th> status</th></tr>
   		 	 </thead>
   		 	
   		 	 <tbody>
			 <c:forEach var="listValue" items="${AvailableEquipment}">
			 	
				<tr>
					
					<td>${listValue.id}</td>
					<td> ${listValue.equipName}</td>
					<td> ${listValue.quantity}</td>
					<td> ${listValue.price}</td>
					<td> ${listValue.condition}</td>
					<td> ${listValue.status}</td>
				</tr>
				
			 </c:forEach>
			 </tbody>
   		 </table>
 
</body>
</html>