<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LISTA DE MERCADORIAS - ValeMob Mercadorias</title>
</head>
<body>
	<%@ include file="navBar.jsp"%>

	<div class="container">
		<h1>Lista de Mercadorias</h1>

		<div class="from-group">
			<c:if test="${not empty mensagem }">
				<div class="alert alert-success">${mensagem }</div>
			</c:if>
		</div>

		<table class="table">
			<tr>
				<th>Código</th>
				<th>Tipo da mercadoria</th>
				<th>Nome</th>
				<th>Quantidade</th>
				<th>Preço</th>
				<th>Tipo de negocio</th>
				<th>AÇÕES</th>
			</tr>
			<c:forEach var="m" items="${listaMercadoria }">
				<tr>
					<td>${m.codigo }</td>
					<td>${m.tipoMercadoria }</td>
					<td>${m.nome }</td>
					<td>${m.quantidade }</td>
					<td>${m.preco }</td>
					<td>${m.tipoNegocio }</td>
					<td>
						<button onclick="excluirMercadoria.value = ${m.codigo }"
							type="button" class="btn btn-danger btn-sm" data-toggle="modal"
							data-target="#myModal">
							<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
						</button>
					</td>
				</tr>
			</c:forEach>
		</table>


		<!-- Codigo para aplicação do Modal para excluir a mercadoria -->
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h4 class="modal-title" id="myModalLabel">Confirmação de
							exclusão de mercadoria</h4>
					</div>
					<div class="modal-body">Tem certeza que você deseja excluir
						esta mercadoria?</div>
					<div class="modal-footer">
						<form action="mercadoriaServlet" method="post">
							<input type="hidden" name="codigo" id="excluirMercadoria">
							<input type="hidden" name="acao" value="excluirMercadoria">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">Cancelar</button>
							<button type="submit" class="btn btn-danger">Excluir</button>
						</form>
					</div>
				</div>
			</div>
		</div>




	</div>

</body>
</html>