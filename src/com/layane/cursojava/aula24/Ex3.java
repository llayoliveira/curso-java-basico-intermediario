package com.layane.cursojava.aula24;

public class Ex3 {
	public static void main(String[] args) {
		LivroLivraria livro = new LivroLivraria();
		
		livro.nome = "Crepúsculo";
		livro.autor = "Stephany Meyer";
		livro.editora = "Integra";
		livro.ano = 2012;
		livro.genero = "Romance";
		livro.sinopse = "Vampiros";
		livro.paginas = 432;
		livro.preco = 52.90;
		
		System.out.println("Nome do livro: " + livro.nome);
		System.out.println("Preço: R$ " + livro.preco);
	}
	
}
