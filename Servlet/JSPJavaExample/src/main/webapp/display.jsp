<%@page import="com.simplilearn.beans.Customer" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>display</title>
</head>
<body>
	<h1>I am from display.jsp</h1>
	<%
		Object obj=session.getAttribute("CUST");
		Customer c=null;
		if(obj!=null){
			c=(Customer)obj;
		}
		
		Object obj1=session.getAttribute("CUST1");
		Customer c1=null;
		if(obj1!=null){
			c1=(Customer)obj1;
		}
	%>
	<h2> CID : <%= c.getCid() %> </h2>
	<h2> CID : <%= c.getCname() %> </h2>
	<h2> CID : <%= c.getEmail() %> </h2>
	<h2> CID : <%= c.getPhone() %> </h2>
	
	<h2> CID : <%= c1.getCid() %> </h2>
	<h2> CID : <%= c1.getCname() %> </h2>
	<h2> CID : <%= c1.getEmail() %> </h2>
	<h2> CID : <%= c1.getPhone() %> </h2>
</body>
</html>