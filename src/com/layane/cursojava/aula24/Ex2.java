package com.layane.cursojava.aula24;

public class Ex2 {

	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.nome = "Crepúsculo";
		livro.autor = "Stephany Meyer";
		livro.editora = "Integra";
		livro.ano = 2012;
		livro.genero = "Romance";
		livro.sinopse = "Vampiros";
		livro.paginas = 432;
		
		System.out.println("Nome do livro: " + livro.nome);
	}

}
