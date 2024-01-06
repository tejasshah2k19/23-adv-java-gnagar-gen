<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

	<form action="BattleServlet" method="post">
		A : <input type="Text" name="cardA"/>${aError }<br><br>
		B : <input type="Text" name="cardB"/>${bError }<br><br>
		
		<input type="submit" value="Battle"/>
	</form>
</body>
</html>