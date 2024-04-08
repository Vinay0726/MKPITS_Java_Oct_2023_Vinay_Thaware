<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cookies Response</title>
</head>
<body>


<% /* read form data */
String favLang=request.getParameter("favoriteLanguage");

//create cookies
Cookie theCookie=new Cookie("myApp.favouriteLanguage",favLang);

//set life span
theCookie.setMaxAge(60*60*24*365); //for year (min,sec,hour,days)

//send cookies to browser
response.addCookie(theCookie);%>

THANKYOU ! WE SET YOUR FAV LANGUAGE to : ${param.favoriteLanguage}

<a href="cookies_homepage.jsp">Go to Homepage</a>

</body>
</html>