<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WebApp</title>
<link rel="stylesheet" href="MainCss.css">
</head>
<body>

	<h1>Login Page</h1>

	<form action="<%=request.getContextPath()%>/Login" method="post">

		Please insert Username: <input type="text" name="u_name" placeholder="Username" /> 
		<br> 
		<br>
		Please insert Password: <input type="text" name="pass" placeholder="********" /> 
		<br>
		<br> 
		<input type="submit" value="Login" />
	</form>
	<br>

</body>
</html>