<%@page import="com.simplilearn.beans.Customer" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert.jsp</title>
</head>
<body>
	<%
		Customer cust = new Customer();
			cust.setCid(202);
			cust.setCname("roger");
			cust.setEmail("rog@gmail");
			cust.setPhone(1234567789);
		session.setAttribute("CUST",cust);
		
		Customer cust1 = new Customer();
			cust1.setCid(203);
			cust1.setCname("roger");
			cust1.setEmail("rog@gmail");
			cust1.setPhone(1234567789);
	session.setAttribute("CUST1",cust1);
	%>
	<jsp:forward page="display.jsp"/>
</body>
</html>