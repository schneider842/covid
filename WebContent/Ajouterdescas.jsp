<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ajouter des cas</title>
</head>
<body>
<jsp:useBean id="Mod" class="model.Model"></jsp:useBean>
	<h2>Ajout d'un cas</h2>
	<form action="ServletTraitementPCR" method="post" name="informations">
		<table width="60%" border="0">		
			<tr>
				<td>Nom complet : </td>
				<td><input name="Nom_complet" type="text" value="" /></td>
			</tr>
			<tr>
				<td>Telephone : </td>
				<td><input name="telephone" type="text" value="" /></td>
			</tr>			
			<tr>
				<td>Adresse:</td>
				
					<td><input name="adresse" type="text" value="" /></td>
				</td>
			</tr>
			<tr>
				<td>Code postale:</td>
				
					<td><input name="code_postale" type="text" value="" /></td>
				</td>
			</tr>
			<tr>
				<td>Etat:</td>
				
					<td><input name="etat" type="text" value="" /></td>
				</td>
			</tr>
			
				<td>&nbsp;</td>
				<td><input name="envoi_btn" type="submit" value="Ajouter..." />
			</tr>
		</table>
	</form>
</body>
</html>