<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.List,com.mkpits.jdbc.Books_Model"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Books Store App</title>
<link type="text/css" rel="stylesheet" href="css/tableStyle.css">
<link type="text/css" rel="stylesheet" href="css/listbookstyle.css">
<script>
	function showMore(id) {
		var button = document.querySelector('button[onclick ="showmore(\''+id+'\')"]');
		var element = document.getElementById(id);


		if(element.style.display === '-webkit-box'){
			element.style.display ='block';
			button.textContent = 'Show Less';
		}else{
			element.style.display ='-webkit-box';
			button.textContent = 'Show More';
		}

	}
	
</script>
</head>
<%
//get the student the RequestDispatcher
List<Books_Model> theStudents = (List<Books_Model>) request.getAttribute("BOOKS_LIST");
%>
<body>
	<div id="wrapper">

		<div id="header">
			<h2
				style="text-align: center; font-size: 40px; color: blue; margin-top: 10px;">Books
				Collections</h2>

			<div class="search"> <input type="text" id="myInput" placeholder="  Search Books..." onkeyup="search()"/></div>
			
			<div class="addBtn" style="height: 60px">
				<input
					style="float: right; font-size: 15px; background-color: #ADD8E6; box-shadow: 2px 2px 2px 2px #C0C0C0; padding: 15px; margin-right: 50px; border-radius: 15px; width: 100px; margin-top: -10px; color: green; border: green;"
					type="button" value="Add Books"
					onclick="window.location.href='add-books-form.jsp';return false;"
					class="add-books-button">
			</div>
		</div>
	</div>

	<div id="container">
		<div id="content">
			<table border="1" id="myTable">
				<tr style="font-size: 20px">
					<!-- <th>ID</th> -->
					<th>Title</th>
					<th>Author</th>
					<th>Date</th>
					<th>Genres</th>
					<th>Character</th>
					<th>Synopsis</th>
					<th class="act">Action</th>

				</tr>
				<c:forEach var="tempBooks" items="${BOOKS_LIST}">
					<!-- Set up a link link for each student -->
					<c:url var="tempLink" value="BooksControllerServlet">
						<c:param name="command" value="LOAD" />
						<c:param name="bookId" value="${tempBooks.id}" />
					</c:url>

					<!-- Set up a link to delete student -->
					<c:url var="deleteLink" value="BooksControllerServlet">
						<c:param name="command" value="DELETE" />
						<c:param name="bookId" value="${tempBooks.id}" />
					</c:url>
					<tr style="font-size: 14px;">
						<%-- <td>${tempBooks.id}</td> --%>
						<td>${tempBooks.title}</td>
						<td>${tempBooks.author}</td>
						<td>${tempBooks.date}</td>
						<td><p id="genres_${tempBooks.id}">${tempBooks.genres}</p>...
							<button class="readMore"
								onclick="showMore('genres_${tempBooks.id}')">Read More</button></td>
						<td>${tempBooks.characters}</td>
						<td><p id="synopsis_${tempBooks.id}">${tempBooks.synopsis}</p>...
							<button class="readMore" 
								onclick="showMore('synopsis_${tempBooks.id}')">Read More</button></td>
						<td class="syp"><button class="updBtn">
								<a class="aText" href="${tempLink}">Update</a>
							</button> |
							<button class="delBtn">
								<a class="aText" href="${deleteLink}"
									onclick="if(!(confirm('Are you sure you want to delete this student ?'))) return false">Delete</a>
							</button></td>

					</tr>
				</c:forEach>
			</table>
		</div>
	</div>

<script>
function search() {
	  let filter=document.getElementById("myInput").value.toUpperCase();
    let myTable=document.getElementById("myTable");
    let tr=myTable.getElementsByTagName("tr");

    for(var i=0;i<tr.length;i++){
       let td=tr[i].getElementsByTagName("td")[0];

       if(td){
        let textvalue=td.textContent || td.innerHTML;

        if(textvalue.toUpperCase().indexOf(filter)> -1){
            tr[i].style.display ="";
        }
        else{
            tr[i].style.display="none";
        }
       }

    }
  }</script>
</body>
</html>