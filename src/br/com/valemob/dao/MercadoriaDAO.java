package br.com.valemob.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import br.com.valemob.beans.Mercadoria;


/** Classe MercadoriaDAO possui os métodos referentes ao beans de Mercadoria 
 * e estabelece conexões com o banco de dados.

 * @author Eduardo Pereira Marques
 * @version 1.0
 * @since 1.0
 * @see Mercadoria
 */

public class MercadoriaDAO {
	
	/** Método cadastrarMercadoria adiciona um novo registro na tabela TB_VMOB_MERCADORIA do banco de dados .
	 * 
	 * @author Eduardo Pereira Marques
	 * @vesion 1.0
	 * @param mercadoira
	 * @param conn
	 * @throws Exception
	 * @return void
	 * @see Mercadoria
	 */
	
	public void cadastrarMercadoria (Mercadoria mercadoria, Connection conn) throws Exception{
		/*String sql = "INSERT INTO TB_VMOB_MERCADORIA(CD_MERCADORIA,"
				+ "DS_TIPO_MERCADORIA,NM_MERCADORIA,DS_QTDE,"
				+ "VL_PRECO,DS_TIPO_NEGOCIACAO) VALUES (SQ_MERCADORIA.nextval, ?, ?, ?, ?, ?) ";*/
		String sql = "INSERT INTO TB_VMOB_MERCADORIA(DS_TIPO_MERCADORIA,NM_MERCADORIA,DS_QTDE,VL_PRECO,DS_TIPO_NEGOCIACAO) VALUES (?, ?, ?, ?, ?) ";
		PreparedStatement stmtInsert = conn.prepareStatement(sql);
		
		stmtInsert.setString(1, mercadoria.getTipoMercadoria());
		stmtInsert.setString(2, mercadoria.getNome());
		stmtInsert.setInt(3, mercadoria.getQuantidade());
		stmtInsert.setFloat(4, mercadoria.getPreco());
		stmtInsert.setString(5, mercadoria.getTipoNegocio());
		stmtInsert.execute();
		stmtInsert.close();
		
	}
	
	/** Metodo listarMercadoria acessa tabela TB_VMOB_MERCADORIA no Banco de dados e adiciona 
	 * um novo registro a uma lista de mercadorias.
	 * 
	 * @author Eduardo Pereira Marques
	 * @vesion 1.0
	 * @param conn
	 * @throws Exception
	 * @return listaMerc
	 * @see Mercadoria
	 */
	
	 public List<Mercadoria> listarMercadoria(Connection conn)throws Exception{
		 List<Mercadoria> listaMerc = new ArrayList<>();
		 String sql = "SELECT * FROM TB_VMOB_MERCADORIA";
		 PreparedStatement stmt = conn.prepareStatement(sql);
		 ResultSet result = stmt.executeQuery();
		 while(result.next()){

			 Mercadoria m = new Mercadoria();
			 m.setCodigo(result.getInt("CD_MERCADORIA"));
			 m.setTipoMercadoria(result.getString("DS_TIPO_MERCADORIA"));
			 m.setNome(result.getString("NM_MERCADORIA"));
			 m.setQuantidade(result.getInt("DS_QTDE"));
			 m.setPreco(result.getFloat("VL_PRECO"));
			 m.setTipoNegocio(result.getString("DS_TIPO_NEGOCIACAO"));
			 listaMerc.add(m);
			 
		 }
		 result.close();
		 stmt.close();
		 return listaMerc;
	 }
	 
	 /** Método remover vai excluir um registro de uma mercadoria pelo codigo informado
		 * pelo usuario e retorna um inteiro como saida.
		 * 
		 * @author Eduardo Pereira Marques
		 * @vesion 1.0
		 * @param codigo
		 * @param conn
		 * @throws Exception
		 * @return int
		 * @see Mercadoria
		 */
	 
	 public int removerPorCodigo(int codigo,Connection conn) throws Exception {

			PreparedStatement stmtInsert = conn.prepareStatement("DELETE FROM TB_VMOB_MERCADORIA WHERE CD_MERCADORIA = ?");
			stmtInsert.setInt(1, codigo);
			int saida = stmtInsert.executeUpdate();
			stmtInsert.close();
			
			return saida;

		}

}
