<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<style type="text/css">
*{
		margin: 0;
		padding: 0;
		box-sizing: border-box;
	}
	html,body{
		width: 100%;
		height: 100%;
		background-image: url("img/login.avif");
		background-size: cover;
		background-repeat: no-repeat;
		display: flex;
		justify-content: center;
		align-items: center;
	}
	.content{
	height: 70%;
	width: 30%;
	border:1px solid grey;
	border-radius:10px;
	background-color:transparent;
    backdrop-filter:blur(10px);
	box-shadow: rgba(0, 0, 0, 0.16) 0px 10px 36px 0px, rgba(0, 0, 0, 0.06) 0px 0px 0px 1px;
	display: flex;
	justify-content: center;
	align-items: center;
	flex-direction: column;
	}
	
	h1{
	color: orange;
	font-size: 35px;
	}
	form{
	
	height: 60%;
	width: 100%;
	background-color:transparent;
    backdrop-filter:blur(10px);
	display: flex;
	/* justify-content: center; */
	align-items: center;
	flex-direction: column;
	gap:10px;
	}
	input {
	width: 90%;
	height: 20%;
	font-size:15px;
	color:white;
	background-color:transparent;
	border: none;
	border-bottom: 1px solid white; 
	outline: none;
	
} 
	button {
	width: 90%;
	height: 20%;
	font-size:20px;
	border-radius: 10px;
}
button:hover{
background-color: black;
color: green;border:1px solid green;}
::placeholder{
color: white;}
h2{
color: green;}
span{
margin-left: 10px;}
a{
text-decoration: none;
color: neon;
}
a:hover{
color: purple;
font-size: 20px;}
	
</style>
<!-- for confirm password -->
 <script>
      function validateForm() {
        let pass = document.getElementById("pass");
        let cpass = document.getElementById("cpass");
        if (pass.value === cpass.value) {
          return true;
        } else {
          alert("Passwords do not match.");
          location.reload();
          return false;
        }
      }
    </script>
</head>
<body>

<div class="content">
<h1>Login</h1>
<form action="LoginControllerServlet" method="post" onsubmit="return validateForm() ">
<input type="text" placeholder="Username" name="uname" required="required">
<input id="pass" type="password" placeholder="Password" name="password" required="required">
<input id="cpass"type="password" placeholder="Confirm Password" required="required">
<button type="submit">Login</button>
</form>
<h2>Not Registered<span><a href="register.jsp">Click Here</a> </span></h2>
</div>
</body>
</html>