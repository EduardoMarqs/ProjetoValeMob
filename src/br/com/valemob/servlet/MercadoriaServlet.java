package br.com.valemob.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.valemob.beans.Mercadoria;
import br.com.valemob.bo.MercadoriaBO;
import br.com.valemob.conection.ConectionFactory;

@SuppressWarnings("serial")
@WebServlet("/mercadoriaServlet")
public class MercadoriaServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String acao = req.getParameter("acao");

		try {
			String us = "root";
			String senha = "NCOabc18699";
			Connection conn = new ConectionFactory().getConnection(us, senha);

			switch (acao) {
			case "cadastrarMercadoria":
				int codMercadoria = Integer.parseInt(req.getParameter("codigo"));
				String tipoMercadoria = req.getParameter("tipo");
				String nomeMercadoria = req.getParameter("nome");
				int qtdeMercadoria = Integer.parseInt(req.getParameter("qtde"));
				float precoMercadoria = Float.parseFloat(req.getParameter("codigo"));
				String tipoNegocio = req.getParameter("tipoNegocio");

				Mercadoria mercadoria = new Mercadoria(codMercadoria, tipoMercadoria, nomeMercadoria, qtdeMercadoria,
						precoMercadoria, tipoNegocio);
				MercadoriaBO.inserir(mercadoria, conn);
				req.setAttribute("mensagem", "Cadastrado com sucesso");
				break;

			case "excluirMercadoria":
				int cdMercadoria = Integer.parseInt(req.getParameter("codigo"));
				MercadoriaBO.apagar(cdMercadoria, conn);
				List<Mercadoria> merc = MercadoriaBO.listarMercadoria(conn);
				req.setAttribute("mensagem", "Mercadoria excluida com sucesso!");
				req.getRequestDispatcher("lista-mercadoria.jsp").forward(req, resp);
				break;
			default:
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("mensagem", "Erro!");
		} finally {
			req.getRequestDispatcher("cadastro-mercadoria.jsp").forward(req, resp);
		}

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String acao = req.getParameter("acao");

		try {
			String us = "root";
			String senha = "NCOabc18699";
			Connection conn = new ConectionFactory().getConnection(us, senha);

			switch (acao) {
			case "listarMercadoria":
				List<Mercadoria> lstMerc = MercadoriaBO.listarMercadoria(conn);
				req.setAttribute("listaMercadoria", lstMerc);
				req.getRequestDispatcher("lista-mercadoria.jsp").forward(req, resp);
				break;

			default:
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
