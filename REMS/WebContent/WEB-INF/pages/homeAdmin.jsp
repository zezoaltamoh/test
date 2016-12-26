<%@ taglib uri="/WEB-INF/lib/spring-form.tld" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Homepage</title>

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
	
	<p> Welcome ${sessionScope.account.getUsername()} </p>
	
<!-- 	<p><a href="/REMS/displayEquipments">View Equipment List</a> -->
<!-- 	<p><a href="/REMS/newOrder">Order Equipment</a> -->
	
	
	<a href="/REMS/displayEquipments" class="btn btn-block btn-lg btn-primary">View Equipment List</a>
	<a href="/REMS/newOrder" class="btn btn-block btn-lg btn-primary">Order Equipment</a>
	<a href="/REMS/addEquipment" class="btn btn-block btn-lg btn-primary">Add New Equipment</a>
	<a href="/REMS/displayOrderPerSupplier" class="btn btn-block btn-lg btn-primary">View Pending Orders</a>
	<a href="/REMS/register" class="btn btn-block btn-lg btn-primary">Add New User</a>
	
</body>
</html>