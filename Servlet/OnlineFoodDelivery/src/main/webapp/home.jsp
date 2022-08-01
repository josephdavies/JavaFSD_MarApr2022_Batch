<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home</title>
</head>
<body>
	
	<jsp:include page="header.jsp">
		<jsp:param value="World's No 1 delivery portal" name="header"/>
	</jsp:include>
	
	<h1>ONLINE FOOD DELIVERY PORTAL</h1>
	
	<h2>Foodie Zone</h2>
	
	<h3>select your favourite delivery partner</h3>
	<form action="service.jsp">
		<select name="deliveringpartner">
			<option value="SW">swiggy</option>
			<option value="ZO">zomato</option>
			<option value="UB">uber eats</option>
			<option value="FO">foodpanda</option>
		</select>
		
		<input type="submit" value="Submit"/>
	</form>
	<jsp:include page="footer.jsp">
		<jsp:param value="by continuing u agreee with our policies" name="footer"/>
	</jsp:include>

</body>
</html>