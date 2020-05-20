<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.leonardo.*" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="estilo.css" rel="stylesheet">
</head>
<body>
	<nav>
		<ul>
			<li><a href="index.html">Home</a></li>
			<li><a href="cadastro.html">Cadastro</a></li>
			<li><a href="sobre.html">Sobre</a></li>
		</ul>
	</nav>
<% 
	String nome = request.getParameter("nome");
	int matricula = Integer.parseInt(request.getParameter("matricula"));
	
	Cadastro obj = new Cadastro();
	
	obj.cadastro(nome, matricula);
%>

<% 
	for (int i = 0; i < obj.lista.size(); i++){
		%><br><%
		out.println("Matricula = " + obj.lista.get(i).getMatrciula());%><br><%
		out.println("Nome = " + obj.lista.get(i).getNome());	
	}
%>


</body>
</html>