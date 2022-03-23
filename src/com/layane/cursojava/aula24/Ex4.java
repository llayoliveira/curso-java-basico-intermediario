package com.layane.cursojava.aula24;

import java.util.Date;

public class Ex4 {
	public static void main(String[] args) {
		LivroBiblioteca livro = new LivroBiblioteca();
		
		livro.nome = "Crepúsculo";
		livro.autor = "Stephany Meyer";
		livro.editora = "Integra";
		livro.ano = 2012;
		livro.genero = "Romance";
		livro.sinopse = "Vampiros";
		livro.paginas = 432;
		livro.prateleira = 4;
		livro.dataEntrega = new Date();
		livro.emprestado = true;
		livro.emprestadoA = "Layane";
	}
}
