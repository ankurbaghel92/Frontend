<html>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<head>

<style>
button2{
    padding-top: 50px;
    padding-right: 30px;
    padding-bottom: 50px;
    padding-left: 80px;

}

</style>

</head>
<body>

 <c:set var="imagefolder" value="Images/ProductImages/"></c:set>
  
 <div class="container col-md-8">
			<div class="list col-md-4 ">
<div class="thumbnail" >

 <img src="${imagefolder}${ProductId}.jpg">

 <div class="caption">
 <h4 style="color:#6082F5"><strong>${Productname}</strong></h4>
 <h4 style="color:#6082F5"><strong>Rs:-${ProductPrice}</strong></h4>
 </div>

</div>
<div class="button2">
<c:url var="addtocart" value="/AddToCart?pid=${ProductId}"></c:url>
 <a class="btn btn-success" href="cart_checkout">Checkout</a>
 <a class="btn btn-success" href="${addtocart}">Add To Cart</a>
</div>
</div>
</div>

</body>
</html>