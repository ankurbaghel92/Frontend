<html>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<body>
<jsp:include page="navbar.jsp"></jsp:include>
	<br><hr>	
 	<jsp:include page="Category.jsp"></jsp:include>
 	<%--  <div class="col-md-8">
	 <jsp:include page="carousel.jsp"></jsp:include>
</div>
 --%>
 
 <div class="col-md-8">
<div class="container col-md-12">
		<div id="mycarousel" class="carousel slide" data-interval="2000"
			data-ride="carousel">
			<div class="carousel-inner">
				<div class="item active">
					<img src="Images/carousel1.png" class="image-responsive" style="width:100%;min-height:100px;margin:auto">
					<div class="carousel-caption">
						<h2>YAMAHA R15</h2>
					</div>
				</div>
				<div class="item">
					<img src="Images/carousel2.png" class="image-responsive" style="width:100%;min-height:100px;margin:auto">
				</div>
				<div class="item">
					<img src="Images/carousel3.png" class="image-responsive" style="width:100%;min-height:100px;margin:auto">
				</div>
				<div class="item">
					<img src="Images/carousel4.png" class="image-responsive" style="width:100%;min-height:100px;margin:auto">
				</div>
					<!-- <div class="item">
					<img src="Images/carousel5.png" class="image-responsive" style="width:100%;min-height:100px;margin:auto">
				</div>
 -->					<div class="item">
					<img src="Images/carousel6.png" class="image-responsive" style="width:100%;min-height:100px;margin:auto">
				</div>
					<div class="item">
					<img src="Images/carousel7.png" class="image-responsive" style="width:100%;min-height:100px;margin:auto">
				</div>
				
</div>

			</div>
</div>
	<br><hr></div>
<jsp:include page="footer.jsp"></jsp:include>
 	
	
	
</body>
</html>
 