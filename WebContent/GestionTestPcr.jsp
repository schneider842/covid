<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gestion TestPcr</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
<jsp:useBean id="model1" class="covid.ModelTestpcr"></jsp:useBean>
	<center>
		<h3>Liste des TestPcr</h3>
	</center>

	
		<table class="table table-striped">
			<tr>
				
				<th>Jours</th>
				<th>Mois</th>
				<th>Année</th>
				<th>Id test</th>
				<th>Resultat</th>
			</tr>
			<c:forEach var="Testpcr" items="${model1.getListe()}">
				<tr>
					
					<td>${Testpcr.getJours()}</td>
					<td>${Testpcr.getMois()}</td>
					<td>${Testpcr.getAnnée()}</td>
					<td>${Testpcr.getId_teste()}</td>
					<td>${Testpcr.getResultat()}</td>			
				</tr>
			</c:forEach>
		</table>
		<div>
			<a href="<c:url value = "/AjouterTestPcr.jsp"/>">AjouterTestPcr</a>



</body>
</html>