package br.com.valemob.bo;

import java.sql.Connection;
import java.util.List;
import br.com.valemob.beans.Mercadoria;
import br.com.valemob.dao.MercadoriaDAO;
import br.com.valemob.exceptions.Excecao;



public abstract class MercadoriaBO {
	
	static MercadoriaDAO dao = new MercadoriaDAO();
	
	/** Método inserir vai aplicar as regras de negocio para inserir um dado
	 * corretamente e após validação, chamara o método da DAO para confirmar
	 * inclusão no banco de dados.
	 * 
	 * @author Eduardo Pereira Marques
	 * @vesion 1.0
	 * @param m
	 * @param conn
	 * @throws Exception
	 * @return void
	 * @see MercadoriaDAO
	 * @see MercadoriaBO
	 */
	
	public static void inserir(Mercadoria m, Connection conn)throws Exception{
		if(m.getNome() == null){
			throw new Excecao("CAMPO INVÁLIDO! Digite o nome da mercadoria no campo. ");
		}
		
		if(m.getTipoMercadoria() == null){
			throw new Excecao("CAMPO INVÁLIDO! Digite o tipo da mercadoria no campo. ");
		}
		
		
		if(m.getTipoNegocio() == null){
			throw new Excecao("CAMPO INVÁLIDO! Selecione ao menos uma opção. ");
		}
		
		
		if (m.getPreco() < 0) {
			throw new Excecao("VALOR INVÁLIDO! Preço do produto menor que 0.");
			
		}
		
		if (m.getQuantidade() < 0) {
			throw new Excecao("VALOR INVÁLIDO! Quantidade do produto menor que 0.");
			
		}
		
		
		else{
			dao.cadastrarMercadoria(m, conn);
		}
		 
	}
	
	/** Método listaMercadoria vai chamar o método listarMercadoria da Classe MercadoriaDAO
	 * @author Eduardo Pereira Marques
	 * @vesion 1.0
	 * @param conn
	 * @throws Exception
	 * @see MercadoriaDAO
	 * @see Mercadoria
	 */
	public static List<Mercadoria> listarMercadoria(Connection conn) throws Exception{
		return dao.listarMercadoria(conn);
	}
	
	
	/** Método apagar vai chamar o método remover da Classe MercadoriaDAO
	 * @author Eduardo Pereira Marques
	 * @vesion 1.0
	 * @param codigoMerc
	 * @param conn
	 * @throws Exception
	 * @return int
	 * @see MercadoiraDAO
	 * @see MercadoriaBO
	 */
	public static void apagar(int codigoMerc, Connection conn) throws Exception{
		dao.removerPorCodigo(codigoMerc, conn);
	}

}
