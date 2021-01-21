<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ServletAuthentification" method="get">  
<h1>Authentification</h1>


Login:			<input type="text" name="login" pattern=".{6,}"/><br/><br/>  
Mot de passe:	<input type="password" name="password"/><br/><br/>  

			<input type="submit" value="Se connecter"/>  
</form>

</body>
</html>