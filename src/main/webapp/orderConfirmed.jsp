<html>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>

<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-route.js"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<body>
<div class="jumbotron">
<h1>Thank you Order has been Confirmed.</h1>
<h2>Product Will be Delivered Shortly.</h2>
<h3>Thank you so much for doing Business with us. Have a Good Day</h3>
<h4>
Order Number :- ${userOrder.id }</h4>
<h4>
Shipping Address:- ${userOrder.shippingAddress}</h4>
<h4>
Billing Address:- ${userOrder.billingAddress}
</h4>

<form:form>
<input type="submit" name="_eventId_finalHome" class="btn btn-success btn-lg" value="Save">

</form:form>





</div>

</body>
</html>