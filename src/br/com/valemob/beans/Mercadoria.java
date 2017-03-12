package br.com.valemob.beans;

import java.io.Serializable;

public class Mercadoria implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int codigo;
	private String tipoMercadoria;
	private String nome;
	private int quantidade;
	private float preco;
	private String tipoNegocio;
	
	
	
	public Mercadoria() {
		super();
	}



	public Mercadoria(int codigo, String tipoMercadoria, String nome, int quantidade, float preco, String tipoNegocio) {
		super();
		this.codigo = codigo;
		this.tipoMercadoria = tipoMercadoria;
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
		this.tipoNegocio = tipoNegocio;
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getTipoMercadoria() {
		return tipoMercadoria;
	}



	public void setTipoMercadoria(String tipoMercadoria) {
		this.tipoMercadoria = tipoMercadoria;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getQuantidade() {
		return quantidade;
	}



	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}



	public float getPreco() {
		return preco;
	}



	public void setPreco(float preco) {
		this.preco = preco;
	}



	public String getTipoNegocio() {
		return tipoNegocio;
	}



	public void setTipoNegocio(String tipoNegocio) {
		this.tipoNegocio = tipoNegocio;
	}
	
	
	
	
	

}
