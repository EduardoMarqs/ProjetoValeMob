<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HOME - ValeMob Mercadorias</title>
</head>
<body>
	<%@ include file="navBar.jsp"%>

	<div class="container">
		<h1>Bem vindo ao sistema de negociação de mercadorias!</h1>
		<h4>Cadastre uma nova mercadoria ou acesse a lista de mercadorias ja cadastradas.</h4>
		<br> <a class="btn btn-success btn-lg"
			href="cadastro-mercadoria.jsp"><span
						class="glyphicon glyphicon-pencil" aria-hidden="true"></span> Cadastrar Mercadoria</a>
						<a class="btn btn-primary btn-lg"
			href="mercadoriaServlet?acao=listarMercadoria"><span
						class="glyphicon glyphicon-th-list" aria-hidden="true"></span> Lista de mercadorias</a>
	</div>


</body>
</html>