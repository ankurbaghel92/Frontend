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
</head>
<body>
	<div class="container">
		<div class="col-md-8">
			<form action="InsertSupplier" class="well form-horizontal">
				<div class="row">
					<h2>Insert A New Supplier</h2>
					<h1 style="background-color: #c4e17f; border-radius: 5px; height: 5px"></h1>
				</div>
				<div class="row">
					<div class="col-md-4">
						<label for="name" class="control-label"><h4>Insert Supplier ID</h4></label>
					</div>
					<div class="col-md-4">
						<div class="input-group">
							<input type=text placeholder="Supplier ID" name="SupId" class="form-control input-lg">
						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-md-4">
						<label for="name" class="control-label"><h4>Insert Supplier Name</h4></label>
					</div>
					<div class="col-md-4">
						<div class="input-group">
							<input type=text placeholder="Supplier Name" name="SupName" class="form-control input-lg">
						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-md-4">
						<label for="name" class="control-label"><h4>Insert Supplier Address</h4></label>
					</div>
					<div class="col-md-4">
						<div class="input-group">
							<input type=text placeholder="Supplier Address" name="SupAdd" class="form-control input-lg">
						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-md-2">
						<div class="form-group">
							<a href=""> <input type="submit"
								class="btn btn-success btn-block btn-lg" value="Submit"></a>
						</div>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>