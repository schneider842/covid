<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
 <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="Mod" class="covid.ModelTestpcr"></jsp:useBean>
<jsp:useBean id="pcr" class="covid.TestPcr"></jsp:useBean>
<jsp:setProperty property="*" name="pcr"/>


${Mod.ajouterTestPcr(pcr)}

	<div>
		<c:import url="/GestionTestPcr.jsp"></c:import>
	</div>
</body>
</html>