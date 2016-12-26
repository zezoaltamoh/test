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
	
	<%@include file = "header.jsp" %>
	
	
	<div class="container">
		
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<h2>Make your order</h2>
	<form:form method="POST" action="addOrder">
		
			
				<label for="equipment.equipName" class="sr-only">Equipment Name</label>
				<form:input path="equipment.equipName" class="form-control" placeholder="Equipment Name" required autofocus/>
				<br>
				<label for="description" class="sr-only">Description</label>
				<form:input path="description" class="form-control" placeholder="Equipment Name" required autofocus/>
				<br>
				Shipping Information
				<label for="state" class="sr-only">State</label>
				<form:input path="state" class="form-control" placeholder="State" required autofocus/>
			
				<br>
			
				<label for="city" class="sr-only">City</label>
				<form:input path="city" class="form-control" placeholder="City" required autofocus/>
			
				<br>
			
				<label for="address" class="sr-only">Address</label>
				<form:input path="address" class="form-control" placeholder="Address" required autofocus/>
			
				<br>
			
				<label for="zipCode" class="sr-only">Zip Code</label>
				<form:input value = "Zip Code" path="zipCode" class="form-control" placeholder="Zip Code" required autofocus/>
			
				<br>
			
				<label for="returnDate" class="sr-only">Choose a return Date</label>
				<form:input type="date" path="returnDate" class="form-control" placeholder="Choose a return Date" required autofocus/>
				<br>
			
			
		<button class="btn btn-lg btn-primary btn-block" value ="Place an Order" type="submit">Place an Order</button>
	
	</form:form>
	
	</div>

</div>

</div>
	
	
	
</body>
</html>