
Skip to content
This repository

    Pull requests
    Issues
    Gist

    @ankurbaghel92

0
0

    0

ankurbaghel92/Frontend-project
Code
Issues 0
Pull requests 0
Projects 0
Wiki
Pulse
Graphs
Settings
Frontend-project/target/yamahaonlinefrontend/contact-us.jsp
2f90cf7 10 days ago
@ankurbaghel92 ankurbaghel92 First Commit
82 lines (70 sloc) 2.46 KB
<html>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<body>

<div class="container" align="center">
<div class="col-md-offset-2">
<form method="post" action="" class="well form-horizontal" >
<h2 style="color:green">Contact-Us<small style="color:green">...Please Feel Free To Get In Touch </small> </h2>
<h1 style="background-color:#c4e17f;border-radius:5px;height: 5px "></h1>
<div class="row">
<div class="col-md-6">
<div class="form-group">
<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-user"></i></span> <input type="text"
								class="form-control input-lg" id="fname" name="fname"
								placeholder="First Name" value="">
						</div></div></div>
<div class="col-md-6">
<div class="form-group">
<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-user"></i></span>
<input type="text"  name="lname" id="lname" placeholder="Last Name" required class="form-control input-lg" tabindex="2" >
</div></div></div>
</div>

<div class="row">
<div class="col-md-6">
<div class="form-group">
<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-envelope"></i></span>
<input type="text" name="email_id" id="enail-id" class="form-control input-lg" required placeholder="Email Id" tabindex="5">
</div>
</div></div>
<div class="col-md-6">
<div class="form-group">
<div class="input-group">
							<span class="input-group-addon">
							<i class="glyphicon glyphicon-earphone"></i>
							</span>
<input type="text"  name="mobile_no" id="mobile_no" placeholder="Mobile Number" required class="form-control input-lg" tabindex="4" >
</div></div></div>
</div>

<div class="row">
<div class="col-md-12">
<div class="form-group">
<textarea class="form-control input-lg" id="name" name="name"
							placeholder="Enter Your Query"></textarea>
</div></div>
</div>

<div class="row">
<div class="col-md-offset-4">
<div class="col-md-4">
<div class="form-group">
<a href=""> <input type="submit" class="btn btn-success btn-block btn-lg" tabindex="8" value="Submit"> </a>
</div></div>
</div>


</div>
</form>


</div>
</div>


		</body>
</html>
