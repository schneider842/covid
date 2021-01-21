<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import="model.Model" import="model.Model"%>
 <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des cas</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>

<jsp:useBean id="model" class="model.Model"></jsp:useBean>
	<center>
		<h3>Liste des Cas</h3>
	</center>

	
		<table class="table table-striped">
			<tr>
				
				<th>Nom_Complet</th>
				<th>Telephone</th>
				<th>Adresse</th>
				<th>Code_Postale</th>
				<th>Etat</th>
			</tr>
			<c:forEach var="c" items="${model.getListe()}">
				<tr>					
					<td>${c.getNom_complet()}</td>
					<td>${c.getTelephone()}</td>
					<td>${c.getAdresse()}</td>
					<td>${c.getCode_postale()}</td>
					<td>${c.isEtat()}</td>			
				</tr>
			</c:forEach>
		</table>
		<div>
			<a href="<c:url value = "/Ajouterdescas.jsp"/>">AjouterCas</a>
			</div>
			<a href="<c:url value = "/GestionTestPcr.jsp"/>">Affichage TestPcr</a>
			
		</div>


</body>
</html>