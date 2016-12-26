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
				<h2>Registration Form</h2>	
				<form:form method="POST" action="addUser" class ="form-signin">

					<label for="username" class="sr-only">Username</label>
        			<form:input type="text" id="username" path ="username" class="form-control" placeholder="Username" required autofocus/>
        			<br>
       				<label for="password" class="sr-only">Password</label>
      				<form:input type="password" path = "password" id="password" class="form-control" placeholder="Password" required/>
       		 		<br>
       		 		<label for="email" class = "sr-only">Email</label>
					<form:input type = "email" path="email" class = "form-control" placeholder = "Email"/>
					<br>
					<label for="fName" class = "sr-only">First Name</label>
					<form:input type="text" path="fName" class="form-control" placeholder="First Name" required autofocus/>
					<br>
					<label for="lName" class = "sr-only">Last Name</label>
					<form:input type="text" path="lName" class="form-control" placeholder="Last Name" required autofocus/>
					<br>
					<label for="address" class = "sr-only">Address</label>
					<form:input type="text" path="address" class="form-control" placeholder="Address" required autofocus/>
					<br>
					<label for="state"  class = "sr-only">State</label>
					<form:input type="text" path="state" class="form-control" placeholder="State" required autofocus/>
					<br>
					<label for="city" class = "sr-only">City</label>
					<form:input type="text" path="city" class="form-control" placeholder="City" required autofocus/>
					<br>
			   		<label for="zipCode" class = "sr-only">Zip Code</label>
					<form:input value = "Zip Code" path="zipCode" class="form-control" placeholder="Zip Code" required autofocus/>
					<br>
					<label for="phoneNum" class = "sr-only">Phone Number</label>
					<form:input value = "Phone Number" path="phoneNum" class="form-control" placeholder="Phone Number" required autofocus/>
					<br>
<!-- 					<td><label for="accountType.accountType" class = "sr-only">Account Type</label> -->
<%-- 					<td><form:input type = "text" path="accountType.accountType" class="form-control" placeholder="Account Type" required autofocus/> --%>
					
					<form:select path="accountType.accountType" placeholder="Account Type" required autofocus class="form-control">
  						<form:option value = "admin">Administrator</form:option>
  						<form:option value = "supplier">Researcher</form:option>
  						<form:option value = "researcher">Supplier</form:option>
					</form:select>
					<br>
       		 
       		 <div class="checkbox">
          
        </div>
        <button class="btn btn-lg btn-primary btn-block" value ="Register" type="submit">Register</button>

				</form:form>
				

			</div>

		</div>

	</div>

	
</body>
</html>