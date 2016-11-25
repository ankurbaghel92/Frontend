<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="navbar.jsp"></jsp:include><br><br><br>
<jsp:include page="Category.jsp"></jsp:include>
<%-- 			<jsp:include page="carousel.jsp"></jsp:include>
 --%> 
 ${SuccessMesssage}
 ${ErrorMesssage}


	<c:if test="${not empty successmessage}">
					<center>
					<br><br><br><br>
			<h4 style="color: green">${successmessage}</h4>
		</center>
				<jsp:include page="adminlogin.jsp"></jsp:include>
		
			<br><br><br><br>
		
	</c:if>

<!-- If User Login is Successful -->
<c:if test="${not empty UserLoginSuccessMessage}">
					<center>
			
			<h4 style="color: green">${UserLoginSuccessMessage} ${Username}</h4>
		</center>
				<jsp:include page="carousel.jsp"></jsp:include>
		
			<br><br><br><br>
		
	</c:if>

<!-- If User Login is not Successful -->
<c:if test="${not empty UserLoginErrorMessage}">
	<br><br><br><br>
				<center>
			<h4 style="color: red">${UserLoginErrorMessage}</h4>
		</center>
		<jsp:include page="login.jsp"></jsp:include>
			<br><br><br><br>
			</c:if>
			
			
			<!-- If User Registration Is SuccessFul -->
			<c:if test="${not empty UserRegisterSuccess}">
						<center>
				<h4 style="color: green">${UserRegisterSuccessMessage}</h4>
		</center>
				<jsp:include page="carousel.jsp"></jsp:include>	<br><br><br><br>
				
			</c:if>
			
			
			<!-- If User Registration is not Successful -->
			<c:if test="${not empty UserRegisterErrorMessage }">
			<center>
			<h4 style="color: red">${UserRegisterErrorMessage}</h4>
		</center><br><br><br>
		<jsp:include page="user-register.jsp"></jsp:include>
			
			
			</c:if>
	
<!-- If the User Clicked Login -->
	<c:if test="${userclickedlogin}">
	<br><br><br><br><br><br>
		<jsp:include page="login.jsp"></jsp:include>
	<br><br><br><br>

	</c:if>

<!-- Show And Hide Carousel -->
<c:if test="${ShowCarousel}">
		<jsp:include page="carousel.jsp"></jsp:include>
	</c:if>

	<c:if test="${not empty ShowAdminForm}">
	<center><h4 style="color: green">${AdminSuccessMessage}</h4></center>
 		<jsp:include page="AdminHomePage.jsp"></jsp:include>
	<br><br><br><br>

	</c:if>
	
	
	<c:if test="${not empty ShowingAllCategory}">
	<center><h4 style="color: green">${ShowingAllCategory}</h4></center>
 		<jsp:include page="WEB-INF/AdminViews/AllCategory.jsp"></jsp:include>
	<br><br><br><br>

	</c:if>
	
	
	<c:if test="${not empty ShowingAllSupplier}">
	<center><h4 style="color: green">${ShowingAllSupplier}</h4></center>
 		<jsp:include page="WEB-INF/AdminViews/AllSupplier.jsp"></jsp:include>
	<br><br><br><br>

	</c:if>
	
		
	
<!-- If User Clicked on Contact Us -->
	<c:if test="${userclickedcontact}">
	<br>
		<jsp:include page="contact-us.jsp"></jsp:include>
		<br><br>
	</c:if>

<!-- If User Clicked on Register -->
	<c:if test="${userclickedRegister}">
	<br><br><br><br>
		<jsp:include page="user-register.jsp"></jsp:include>
	</c:if>

<!-- If User Clicked on About Us -->
		<c:if test="${userclickedAbout}">
	<br><br><br><br><br><br>
		<jsp:include page="about-us.jsp"></jsp:include>
	</c:if>
	
	<!-- CATEGORY FORM ACTIONS -->
	
	<!-- If Admin Clicked on InsertCategory -->
	<c:if test="${userclickedInsertCategory}">
		<jsp:include page="WEB-INF/AdminViews/InsertCategory.jsp"></jsp:include>
	</c:if>	
			<!-- If Insert Category is SuccessFul -->
<c:if test="${not empty InsertCategorySuccess}">
				<center><h4 style="color: green">${InsertCategorySuccess}</h4></center>
 		<jsp:include page="WEB-INF/AdminViews/AllCategory.jsp"></jsp:include>
			<br><br><br><br>
	</c:if>
	
	<!-- If Admin Clicked on ModifyCategory -->
		<c:if test="${not empty UserCLickedModifyCategory}">
 		<jsp:include page="WEB-INF/AdminViews/ModifyCategory.jsp"></jsp:include>
	<br><br><br><br>
	</c:if> 
	
		
		<!-- If Modify Category is SuccessFul -->
		<c:if test="${not empty ModifyCategorySuccess}">
				<center><h4 style="color: green">${ModifyCategorySuccess}</h4></center>
				 		<jsp:include page="WEB-INF/AdminViews/AllCategory.jsp"></jsp:include>
							<br><br><br><br>
	</c:if>
		
	<!-- If Delete Category is SuccessFul -->
		<c:if test="${not empty DeleteCategorySuccess}">
				<center><h4 style="color: green">${DeleteCategorySuccess}</h4></center>
				 		<jsp:include page="WEB-INF/AdminViews/AllCategory.jsp"></jsp:include>
							<br><br><br><br>
	</c:if>
		
	
		<!-- SUPPLIER FORM ACTIONS -->
	
	<!-- If Admin Clicked on InsertSupplier -->
	
		<c:if test="${UserClickedInsertSupplier}">
		<jsp:include page="WEB-INF/AdminViews/InsertSupplier.jsp"></jsp:include>
	<br><br><br><br>
	</c:if>
	
		<!-- If Insert Supplier is SuccessFul -->
	<c:if test="${not empty InsertSupplierSuccess}">
				<center><h4 style="color: green">${InsertSupplierSuccess}</h4></center>
				<jsp:include page="WEB-INF/AdminViews/AllSupplier.jsp"></jsp:include>
			<br><br><br><br>
	</c:if>
	
	<!-- If Admin Clicked on ModifySupplier -->
		<c:if test="${not empty AdminClickedModifySupplier}">
 		<jsp:include page="WEB-INF/AdminViews/ModifySupplier.jsp"></jsp:include>
	<br><br><br><br>
	</c:if> 
	
	<!-- If Modify Supplier is SuccessFul -->

<c:if test="${not empty ModifySupplierSuccess}">
				<center><h4 style="color: green">${ModifySupplierSuccess}</h4></center>
				 		<jsp:include page="WEB-INF/AdminViews/AllSupplier.jsp"></jsp:include>
							<br><br><br><br>
	</c:if>

		<!-- If Delete Supplier is SuccessFul -->
		<c:if test="${not empty DeleteSupplierSuccess}">
				<center><h4 style="color: green">${DeleteSupplierSuccess}</h4></center>
				 		<jsp:include page="WEB-INF/AdminViews/AllSupplier.jsp"></jsp:include>
							<br><br><br><br>
	</c:if>
		
	
	
	
	
	
	
		<c:if test="${userclickedInsertProduct}">
		<jsp:include page="WEB-INF/AdminViews/InsertProduct.jsp"></jsp:include>
	</c:if>	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

<c:if test="${userclickedFZ}">
	<br><br><br>
		<jsp:include page="FZ.jsp"></jsp:include>
	<br><br><br><br>

	</c:if>
<%-- 
	<c:if test="${not empty AdminSuccessMessage}">
	<center><h4 style="color: green">${AdminSuccessMessage}</h4></center>
		<jsp:include page="AdminHomePage.jsp"></jsp:include>
	<br><br><br><br>

	</c:if>
 --%>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>