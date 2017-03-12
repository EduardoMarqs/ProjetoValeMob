<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="js/jquery-3.1.0.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expanded="false">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="index.jsp">VALEMOB Mercadorias</a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">

				<li><a href="cadastro-mercadoria.jsp"><span
						class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
						Cadastrar Mercadoria</a></li>
				<li><a href="mercadoriaServlet?acao=listarMercadoria"> <span
						class="glyphicon glyphicon-th-list" aria-hidden="true"></span>
						Lista de mercadorias
				</a></li>
			</ul>
		</div>
	</div>
</nav>