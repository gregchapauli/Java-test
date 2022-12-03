<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--Importation du taglib pour ecriture JSTL--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Bonjour</title>
</head>

<body>
	<%--Inclusion du menu--%>
	<%@ include file="menu.jsp" %>
	
	<%--Manipulation du bean auteur--%>
	<p>Bonjour ${ auteur.prenom }<p/>
	
	<%--Ecriture JSTL--%>
	<p><c:out value="Salut !" /></p>
	
	<c:if test="${ !empty form.resultat }"><p><c:out value="${ form.resultat }" /></p></c:if>

	<%--Formulaire--%>
	<form method="post" action="bonjour">
		<p>
			<label for="login">Login : </label>
			<input type="text" id="login" name="login" />
		</p>
		<p>
			<label for="pass">Mot de passe : </label>
			<input type="password" id="pass" name="pass" />
		</p>
		
		<input type="submit" />
	</form>
</body>

</html>