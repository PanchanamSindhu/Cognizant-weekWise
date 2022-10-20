<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login</h1>
${SPRING_SECURITY_LAST_EXCEPTION.message}
<form action="login" method='POST'>
<h4>User Name</h4>
<br>
<input type="text" name='username' value="">
<br><br>
<h4>PassWord</h4>
<br>
<input type="password" name='password' value="">
<br><br>
<input type="submit" name="submit" value="login">
</form>
</body>
</html>