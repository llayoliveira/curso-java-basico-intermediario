package com.layane.cursojava.aula61;

public class PassagemValorParametro {

	public static void main(String[] args) {
		Contato contato = new Contato("Contato 1", "1231-5678", "contato1@email.com");
		int valor = 10;

		System.out.println("*******Valores originais");
		System.out.println(contato);
		System.out.println(valor);

		System.out.println("*******Exemplo 1");
		testePassagemValorReferencia(valor, contato);
		System.out.println(contato);
		System.out.println(valor);

		System.out.println("*******Exemplo 2");
		testePassagemValorReferencia2(valor, contato);
		System.out.println(contato); 
		System.out.println(valor) ;

	}

	private static void testePassagemValorReferencia(int valor, Contato contato) {
		int novoValor = valor + 10;
		valor = novoValor;

		contato = new Contato("Contato 2", "2345-6789", "contato2@email.com");
		//System.out.println("Ref1" + contato); //no main o contato tem outro end de memória
	}

	private static void testePassagemValorReferencia2(int valor, Contato contato) {
		int novoValor = valor + 10;
		valor = novoValor;

		contato.setNome("Contato" + novoValor);
		//System.out.println("Ref2" + contato);
	}

}
