package br.com.valemob.test;

import java.sql.Connection;

import javax.swing.JOptionPane;

import br.com.valemob.conection.ConectionFactory;

public class TestConection {

	public static void main(String[] args) throws Exception {
		Connection c = null;
		try{
			String u = JOptionPane.showInputDialog("Digite o usuário");
			String s = JOptionPane.showInputDialog("Digite a senha");
			c = ConectionFactory.controlarInstancia().getConnection(u, s);
			System.out.println("Conexão aberta!");
		}catch (Exception e){
			e.printStackTrace();
			System.out.println("Erro de conexão");
		}finally{
			try{
				c.close();
			}catch(Exception e){
				System.out.println(e);
				 
			}
		}
	}

}
