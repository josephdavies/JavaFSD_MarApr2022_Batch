<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>service</title>
</head>
<body>
	<h1>I am from service</h1>
	<%
		String partner = request.getParameter("deliveringpartner");
		if(partner.equalsIgnoreCase("SW")){
		
	%>
		<jsp:forward page="swiggy.jsp">
			<jsp:param value="www.swiggy.com" name="URL"/>
			<jsp:param value="help@swiggy.com" name="help"/>
		</jsp:forward>
		<%
		} else if(partner.equalsIgnoreCase("ZO")){
		%>
		<jsp:forward page="zomato.jsp">
			<jsp:param value="https://www.zomato.com/" name="URL"/>
			<jsp:param value="help@zomato.com" name="help"/>
		</jsp:forward>
		<%
		} else if(partner.equalsIgnoreCase("UB")){
		%>
		<jsp:forward page="ubereats.jsp">
			<jsp:param value="www.ubereats.com/" name="URL"/>
			<jsp:param value="help@ubereats.com" name="help"/>
		</jsp:forward>
		<%
		} else{
		%>
		<jsp:forward page="foodpanda.jsp">
			<jsp:param value="www.foodpanda.com" name="URL"/>
			<jsp:param value="help@foodpanda.com" name="help"/>
		</jsp:forward>
		<%} %>
</body>
</html>