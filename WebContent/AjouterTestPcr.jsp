<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AjouterTestPcr</title>
</head>
<body>
<jsp:useBean id="Mod" class="covid.ModelTestpcr"></jsp:useBean>

	<h2>Ajouter un Test Pcr</h2>
	<form action="AffichageTest" method="post" name="informations">
		<table width="60%" border="0">
			
			<tr>
				<td>Jour : </td>
				<td><input name="jours" type="text" value="" /></td>
			</tr>
			<tr>
				<td>Mois : </td>
				<td><input name="mois" type="text" value="" /></td>
			</tr>			
			<tr>
				<td>Année:</td>
				
					<td><input name="année" type="text" value="" /></td>
				</td>
			</tr>
			<tr>
				<td>Id teste:</td>
				
					<td><input name="id_teste" type="text" value="" /></td>
				</td>
			</tr>
			<tr>
				<td>Resultat:</td>
				
					<td><input name="resultat" type="text" value="" /></td>
				</td>
			</tr>
			
				<td>&nbsp;</td>
				<td><input name="envoi_btn" type="submit" value="Ajouter..." />
			</tr>
		</table>
	</form>

</body>
</html>