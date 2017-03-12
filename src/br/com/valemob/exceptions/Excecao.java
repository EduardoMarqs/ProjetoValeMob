package br.com.valemob.exceptions;

public class Excecao extends Exception {
	public Excecao(String mensagem, Exception e){
		super(mensagem, e);
		if (e.getClass().toString().equals("class java.lang.NumberFormatException")){
			System.out.println("Número inválido");
		}else if(e.getClass().toString().equals("class java.lang.ArithmeticException")){
			System.out.println("Divisão por 0");
		}
		this.print();
		e.printStackTrace();
		//Envia o e-mail para o responsável
	}
	public Excecao (String mensagem){
		super(mensagem);
		//Envia e-mail para o responsável
	}
	public void print(){
		System.out.println("============== Tratando erro ================");
		System.out.println(getMessage());
		System.out.println("PrintStackTrace: ");
	}

	
}
