<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

html, body {
	width: 100%;
	height: 100%;
	background-image: url("img/register.avif");
	background-size: cover;
	background-repeat: no-repeat;
	display: flex;
	justify-content: center;
	align-items: center;
}

.content {
	height: 90%;
	width: 30%;
	border: 1px solid grey;
	border-radius: 10px;
	background-color: transparent;
	backdrop-filter: blur(10px);
	box-shadow: rgba(0, 0, 0, 0.16) 0px 10px 36px 0px, rgba(0, 0, 0, 0.06)
		0px 0px 0px 1px;
	display: flex;
	justify-content: center;
	align-items: center;
	flex-direction: column;
}

h1 {
	color: orange;
	font-size: 35px;
	margin-top: -50px;
}

form {
	margin-left: 20px;
	width: 95%;
	
	background-color: transparent;
	backdrop-filter: blur(10px);
	height: 60%;
	/* display: flex;
	/* justify-content: center; */
	/* align-items: center;
	flex-direction: column; */
	/* gap:10px; */
	*/
}

input {
	width: 90%;
	height: 13%;
	font-size: 15px;
	background-color: transparent;
	border: none;
	outline:none;
	border-bottom: 1px solid white;
}

button {
margin-top:10px;
	width: 90%;
	height: 15%;
	font-size: 20px;
	border-radius: 10px;
}
button:hover{
background-color: black;
color: blue;border:1px solid white;
}
select{
width: 90%;
height: 15%;
font-size: 15px;
	background-color: transparent;
	border: none;
	border-bottom: 1px solid white;
	outline: none;
	color: grey;}
</style>
</head>
<body>
	<div class="content">
		<h1>Registration Form</h1>
		<form action="LoginControllerServlet" method="get">
			<input type="text" placeholder="Name" name="name"> <input type="email"
				placeholder="Email" name="email"><br> 
			<select id="gender" name="gender"  required>
			<option>Gender</option>
				<option value="male">Male</option>
				<option value="female">Female</option>

			</select>
			<select name="city" required>
			<option>City</option>
				<option value="mumbai">Mumbai</option>
				<option value="pune">Pune</option>
					<option value="nagpur">Nagpur</option>
				<option value="hyderabad">Hyderabad</option>

			</select> <input type="number" placeholder="Mobile" name="mobile"> <input
				type="text" placeholder="Username" name="uname"> <input type="password"
				placeholder="Password" name="password"> <!-- <input type="password"
				placeholder="Confirm Password"> -->
			<button type="submit">Register</button>
		</form>

	</div>
</body>
</html>