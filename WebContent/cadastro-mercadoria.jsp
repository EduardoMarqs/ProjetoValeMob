<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CADASTRO DE MERCADORIAS - ValeMob Mercadorias</title>
</head>
<body>

	<%@ include file="navBar.jsp"%>

	<div class="container">
		<h1>Cadastrar mercadoria</h1>
		<div class="row">
			<div class="col-md-4">
				<form method="post" action="mercadoriaServlet"
					onsubmit="return validaCadastro()">
					<input type="hidden" name="acao" value="cadastrarMercadoria">

					<div class="alert alert-danger">
						<span id="aviso"></span>
					</div>

					<div class="from-group">
						<c:if test="${not empty mensagem }">
							<div class="alert alert-success">${mensagem }</div>
						</c:if>
					</div>

					<div class="form-group">
						<label for="idCodigo">Código da mercadoria</label> <input
							type="text" name="codigo" id="idCodigo" class="form-control"
							onblur="validarObrigatorio(this)">

					</div>

					<div class="form-group">
						<label for="idTipo">Tipo da mercadoria</label> <input type="text"
							name="tipo" id="idTipo" class="form-control"
							onblur="validarObrigatorio(this)">
					</div>

					<div class="form-group">
						<label for="idNome">Nome da mercadoria</label> <input type="text"
							name="nome" id="idNome" class="form-control"
							onblur="validarObrigatorio(this)">
					</div>

					<div class="form-group">
						<label for="idQtde">Quantidade</label> <input type="text"
							name="qtde" id="idQtde" class="form-control"
							onblur="validarObrigatorio(this)">
					</div>

					<div class="form-group">
						<label for="idPreco">Preço</label> <input type="text" name="preco"
							id="idPreco" class="form-control"
							onblur="validarObrigatorio(this)">
					</div>

					<div class="form-group">

						<label for="idTipoNegocio">Tipo de negócio</label> <select
							name="tipoNegocio" id="idTipoNegocio" class="form-control">
							<option value="0">Selecione</option>
							<option value="Compra">Compra</option>
							<option value="Venda">Venda</option>

						</select>
					</div>

					<div class="form-group">
						<input type="submit" class="btn btn-success"
							name="cadastrarMercadoria" value="Cadastrar">
					</div>


				</form>
			</div>

		</div>


	</div>
	<script type="text/javascript" src="js/validation.js"></script>

</body>
</html>