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
				<form:form method="POST" action="loginUser" class ="form-signin">

					<label for="username" class="sr-only">Username</label>
        			<form:input id="username" path ="username" class="form-control" placeholder="Username" required autofocus/>
        			<br>
       				<label for="password" class="sr-only">Password</label>
      				<form:input type="password" path = "password" id="password" class="form-control" placeholder="Password" required/>
       		 <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Remember me
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" value ="Login" type="submit">Sign in</button>
        
        

				</form:form>
				

			</div>

		</div>

	</div>


</body>

</html>