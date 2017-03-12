package br.com.valemob.conection;

import java.sql.Connection;
import java.sql.DriverManager;

public final class ConectionFactory {

	private static ConectionFactory conexao = null;

	public static ConectionFactory controlarInstancia() {
		if (conexao == null) {
			conexao = new ConectionFactory();
		}
		return conexao;
	}

	public Connection getConnection(String usuario, String senha) throws Exception {

		//String url = "jdbc:oracle:thin:/:@localhost:1521:xe";
		String url = "jdbc:mysql://mysql126000-projetovmobepm.jelasticlw.com.br/ProjetoValeMob";

		if (url.indexOf("oracle") > 0) {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} else if (url.indexOf("mysql") > 0) {
			Class.forName("com.mysql.jdbc.Driver");
		}

		return DriverManager.getConnection(url, usuario, senha);

	}

	//jdbc:oracle:thin:/:@localhost:1521:xe
}
