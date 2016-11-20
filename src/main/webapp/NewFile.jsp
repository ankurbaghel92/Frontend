
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<title>Insert title here</title>
</head>
<body>

	<form:form method="post" action="register" commandName="user">
		<form:label path="">Name</form:label>
		<form:input path="" type="text" />
		
			<form:label path="">Password</form:label>
		<form:input path="" type="text" />
	</form:form>

</body>
</html>