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

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container" align="center">
		<div class="col-md-offset-2 col-md-8">
			<form:form method="post" action="loginform" class="well form-horizontal" modelAttribute="login">
				<h2 style="color:green">
					Login Here<small style="color:green">...You are our Existing Customer</small>
				</h2>
				<h1
					style="background-color: #c4e17f; border-radius: 5px; height: 5px"></h1>
				<div class="row">
					<div class="col-md-8">
											<div class="col-md-offset-4">
					
						<div class="form-group">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="glyphicon glyphicon-user"></i></span> <form:input type="text" 
									class="form-control input-lg" path="username" name="username"
									placeholder="User Name" />
							</div>
						</div>
					</div></div>
				</div>
				<div class="row">

					<div class="col-md-8">
						<div class="col-md-offset-4">

							<div class="form-group">
								<div class="input-group">
									<span class="input-group-addon"><i
										class="glyphicon glyphicon-user"></i></span> <form:input type="password"
										placeholder="Password" name="password"
										class="form-control input-lg" tabindex="2" path="password" />
								</div>
							</div>
						</div>
					</div>
				</div>
				
				<div class="row">
					<div class="col-md-offset-4">
						<div class="col-md-4">
							<div class="form-group">
								<a href=""> <input type="submit"
									class="btn btn-success btn-block btn-lg" tabindex="8"
									value="Login">
								</a>
							</div>
						</div>
					</div>
				</div>

</form:form>

		</div>
	</div>


</body>
</html>