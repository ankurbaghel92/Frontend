<html>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body>

<div class="container">
<ul class="nav nav-pills" role="tablist">
<c:forEach items= "${categorylist}" var="category">
<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">${category.name}</a>
<ul class="dropdown-menu" role="menu">
<c:forEach items="${category.products}" var="product">
<li><a href="#">${product.name}</a></li>


</c:forEach>

</ul>


</li>
</c:forEach>


</ul>

</div>


</body>
</html>