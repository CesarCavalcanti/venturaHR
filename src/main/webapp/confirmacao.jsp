<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

	<%
		String nome = (String)request.getAttribute("nome");
	%>
	<div class= "container">
		<form action=""  >
			<h3> Usuario <%=nome %> Foi Cadastrado com sucesso</h3>
			<a href="home.jsp">Voltar</a>
		</form>
		<hr>
	
	</div>
	
	
</body>
</html>