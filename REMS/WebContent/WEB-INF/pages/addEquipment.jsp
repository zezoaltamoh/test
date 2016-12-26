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
			
	<h2>New Equipment Form</h2>
	<form:form method= "POST" action="newEquipment">
	
		
			
				<label for="equipName" class="sr-only">Equipment Name</label>
				<form:input path="equipName" class="form-control" placeholder="Equipment Name" required autofocus/>
				<br>
				<label for="quantity" class="sr-only">Quantity</label>
				<form:input value = "quantity" path="quantity" class="form-control" placeholder="Quantity" required autofocus/>
				<br>
				<label for="price" class="sr-only">Price</label>
				<form:input value = "price" path="price" class="form-control" placeholder="Price" required autofocus/>
				<br>
				<label for="condition" class="sr-only">Condition</label>
				<form:input path="condition" class="form-control" placeholder="Condition" required autofocus/>
				<br>
				<label for="status" class="sr-only">Status</label>
				<form:input path="status" class="form-control" placeholder="Status" required autofocus/>
				<br>
				<label for="category.categName" class="sr-only">Category</label>
				<form:input path="category.categName" class="form-control" placeholder="Category" required autofocus/>
				<br>
			<button class="btn btn-lg btn-primary btn-block" value ="Add Equipment" type="submit">Add Equipment</button>
			
		
		
	</form:form>
	</div>

</div>

</div>
</body>
</html>