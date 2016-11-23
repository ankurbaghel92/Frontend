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
	<%-- <jsp:include page="Category.jsp"></jsp:include>
	 --%>

	<c:if test="${not empty errormessage}">
	<br><br><br><br>
				<center>
			<h4 style="color: red">${errormessage}</h4>
		</center>
		<jsp:include page="login.jsp"></jsp:include>
			<br><br><br><br>
		
	</c:if>
	<c:if test="${not empty successmessage}">
					<center>
					<br><br><br><br>
			<h4 style="color: green">${successmessage}</h4>
		</center>
				<jsp:include page="adminlogin.jsp"></jsp:include>
		
			<br><br><br><br>
		
	</c:if>


	<c:if test="${userclickedlogin}">
	<br><br><br><br><br><br>
		<jsp:include page="login.jsp"></jsp:include>
	<br><br><br><br>

	</c:if>
	
	<c:if test="${userclickedInsertCategory}">
	<br><br><br><br><br><br>
								<jsp:include page="InsertCategory.jsp"></jsp:include>
					<br><br><br><br>

	</c:if>
	
	
<c:if test="${not empty InsertCategorySuccess}">
				<center><h4 style="color: green">${InsertCategorySuccess}</h4></center>
				<jsp:include page="InsertCategory.jsp"></jsp:include>
			<br><br><br><br>
		
	</c:if>
		




	
		<c:if test="${UserClickedInsertSupplier}">
	<br><br><br><br><br><br>
									<jsp:include page="InsertSupplier.jsp"></jsp:include>
	<br><br><br><br>
	</c:if>
	
	<c:if test="${not empty InsertSupplierSuccess}">
				<center><h4 style="color: green">${InsertSupplierSuccess}</h4></center>
				<jsp:include page="InsertSupplier.jsp"></jsp:include>
			<br><br><br><br>
	</c:if>
	
	
	

<c:if test="${userclickedFZ}">
	<br><br><br>
		<jsp:include page="FZ.jsp"></jsp:include>
	<br><br><br><br>

	</c:if>



	<c:if test="${userclickedcontact}">
	<br>
		<jsp:include page="contact-us.jsp"></jsp:include>
		<br><br>
	</c:if>

	<c:if test="${userclickedRegister}">
	<br><br><br><br><br><br>
		<jsp:include page="user-register.jsp"></jsp:include>
	</c:if>

	<c:if test="${userclickedHome}">
	<br><br>
			<jsp:include page="carousel.jsp"></jsp:include>
			<br><br>
		</c:if>

	<c:if test="${userclickedAbout}">
	<br><br><br><br><br><br>
		<jsp:include page="about-us.jsp"></jsp:include>
	</c:if>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>