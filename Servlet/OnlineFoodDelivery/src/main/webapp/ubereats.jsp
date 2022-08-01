<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ubereats</title>
</head>
<body>
	
	<jsp:include page="header.jsp">
		<jsp:param value="World's No 1 delivery portal" name="header"/>
	</jsp:include>
	<h1>Welcome to ubereats!! order food to your door</h1>
	<br>
	Click on url for redirect to portal ${param.URL}
	<br>
	For any query ${param.help}
	<br>
	<jsp:include page="footer.jsp">
		<jsp:param value="by continuing u agreee with our policies" name="footer"/>
	</jsp:include>
</body>
</html>