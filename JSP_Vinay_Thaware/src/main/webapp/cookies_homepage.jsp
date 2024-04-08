<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
</head>
<body>

<h3>Training</h3>
<!-- Read The Fav Language from Cookie  -->

<% //default if there are no cookies
  String lang="Java";
  //get Cookies From Browser 
  Cookie[] theCookies=request.getCookies();
  //find our fav lang cookies
  if(theCookies!=null){
  for(Cookie tempCookie : theCookies){
  if("myApp.favouriteLanguage".equals(tempCookie.getName())){
  lang=tempCookie.getValue();
  break;
  }
  }
  }%>
  
  <h3>New Books For <%=lang%></h3>
  <ul>
  <li>Hello There</li>
  <li>Hello There</li></ul>
  
   <h3>New Report For <%=lang%></h3>
  <ul>
  <li>Hello There</li>
  <li>Hello There</li></ul>
   <h3>New Jobs For <%=lang%></h3>
  <ul>
  <li>Hello There</li>
  <li>Hello There</li></ul>
  
  <a href="cookies_personal_form.html">Go to Personal Form</a>
</body>
</html>