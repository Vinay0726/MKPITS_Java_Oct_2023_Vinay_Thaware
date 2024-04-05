<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Name : ${param.fName} ${param.lName}
	<br> City : ${param.city}
	<br> Gender: ${param.gender}
	<br> Language:
	<ul>
		<%
		String[] lang = request.getParameterValues("lang");
		for (String temp : lang) {
			out.println("<li>" + temp + "</li>");
		}
		%>
		</ul>
	
</body>
</html>