<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.error {
	color: red;
}
</style>
</head>
<body>

	<form action="LoginServlet" method="post">
		Email : <input type="text" name="email" value="${emailValue }" /> <span class="error">${emailError }</span>
		<br>
		<Br> Password : <input type="password" name="password"  /> <span
			class="error">${passwordError }</span> <Br>
		<Br> <input type="submit" value="Login" />

	</form>
	<Br>
	<br>


</body>
</html>