<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.List,com.mkpits.jdbc.Books_Model"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Tracker App</title>
<link type="text/css" rel="stylesheet" href="css/listbookstyle.css">
</head>
<%
//get the student the RequestDispatcher
List<Books_Model> theStudents = (List<Books_Model>) request.getAttribute("BOOKS_LIST");
%>
<body>
	<div id="wrapper">
		<div id="header">
			<h2 style="text-align: center;font-size: 40px;color: blue;">Books</h2>
		</div>
	</div>

	<div id="container">
		<div id="content">
			<table border="1">
				<tr>
				<th>ID</th>
					<th>Title</th>
					<th>Author</th>
					<th>Date</th>
					<th>Genres</th>
					<th>Character</th>
					<th>Synopsis</th>
				</tr>
				<c:forEach var="tempBooks" items="${BOOKS_LIST}">
                <tr>
				<td>${tempBooks.id}</td>
					<td>${tempBooks.title}</td>
					<td>${tempBooks.author}</td>
					<td>${tempBooks.date}</td>
					<td>${tempBooks.genres}</td>
					<td>${tempBooks.characters}</td>
					<td>${tempBooks.synopsis}</td>
					
				</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>