<html>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
		<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	

<body>
	<div class="container col-md-8" align="center">
			<form:form method="post" action="userform" class="well form-horizontal" modelAttribute="user">
				<h2 style="color: green">
					Please sign up<small style="color: green">...Its Free and
						Always be... </small>
				</h2>
				<h1
					style="background-color: #c4e17f; border-radius: 5px; height: 5px"></h1>
				<div class="row">
					<div class="col-md-6">
						<div class="form-group">
							<div class="input-group">
								<span class="input-group-addon"> <i
									class="glyphicon glyphicon-user"></i></span>
									<form:input type="text" name="fname" id="fname" placeholder="First Name" path="fname" class="form-control input-lg" tabindex="1"/>
							       <font color="RED"><form:errors path="fname"></form:errors></font>
									
							</div>
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<div class="input-group">
								<span class="input-group-addon"> <i
									class="glyphicon glyphicon-user"></i></span>
									<form:input type="text" name="lname" placeholder="Last Name" path="lname" class="form-control input-lg" tabindex="2"/>
									<font color="RED"><form:errors path="lname"></form:errors></font>
							</div>
						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-md-6">
						<div class="form-group">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="glyphicon glyphicon-envelope"></i></span>
									<form:input type="email" name="email_id" id="enail-id" class="form-control input-lg" path="email" placeholder="Email Id" tabindex="3"/>
									<font color="RED"><form:errors path="email"></form:errors></font>
							</div>
						</div>
					</div>

					<div class="col-md-6">
						<div class="form-group">
							<div class="input-group">
								<span class="input-group-addon"> <i
									class="glyphicon glyphicon-earphone"></i>
								</span>
							<form:input type="text" name="mobile_no" id="mobile_no" placeholder="Mobile Number" path="mobile" class="form-control input-lg" tabindex="4" />
							<font color="RED"><form:errors path="mobile"></form:errors></font>
							</div>
						</div>
					</div>
				</div>

							
				
		
		<div class="row">
			<div class="col-md-6">
				<div class="form-group">
					<form:input type="password" name="password" id="password" placeholder="Password" path="password" class="form-control input-lg"	tabindex="5"/>
					<font color="RED"><form:errors path="password"></form:errors></font>
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
				<form:input type="password" name="con-password" id="con-password" path="ComPassword" placeholder="Confirm Password"	class="form-control input-lg" tabindex="6"/>
				<font color="RED"><form:errors path="ComPassword"></form:errors></font>
				</div>
			</div>
		</div>

		<div class="row">
			
			<div class="col-md-6">
				By clicking <strong class="label label-primary">Register</strong>,
				you agree to the Terms and Conditions
			</div>
		</div>
		<h1 style="background-color: #c4e17f; border-radius: 5px; height: 5px"></h1>
		<div class="row">
			<div class="col-md-6">
				<div class="form-group">
					<input type="submit" class="btn btn-primary btn-block btn-lg" tabindex="7" value="Register" onclick="return validate()" >
				</div>
			</div>
		

		</div>
</form:form>

	</div>
	
	
</body>
</html>