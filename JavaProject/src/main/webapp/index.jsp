<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>
	<h1>Login</h1>
	<form action="login" method="post">
		Name: <input type="text" name="name" required>
		<br>
		Password: <input type="password" name="password" required>
		<br>
		<input type="submit" value="login">
	</form>
</body>
</html>