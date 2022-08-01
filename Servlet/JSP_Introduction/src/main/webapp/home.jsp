<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>introduction to JSP</h1>

<h2>declaration tag</h2>
<%!
int a=10;
int b=20;

String course = "jsp browser";

public String getBatch(){
	return "we learning "+course+" !!!";
}
%>

<h2>scriptlet tag</h2>
<%
out.print(a);
out.print("<br>");
out.print(course);
out.print("<br>");
out.print("geting batch "+getBatch());
%>

<h2>jsp expression tag</h2>
<%= a %>
<br>
<%= getBatch() %>

</body>
</html>