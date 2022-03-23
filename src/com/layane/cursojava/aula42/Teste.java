package com.layane.cursojava.aula42;

public class Teste {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();		
		//Pessoa aluno = new Aluno();
		//Pessoa professor = new Professor();

		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		//exemplo 2
		System.out.println(Constantes.URL_BLOG);
		//Constantes.URL_BLOG = "dskdjksjks"; //quando coloca o final, não pode modificar
		
		System.out.println(Constantes.URL_BLOG);
		
		final int TOTAL = 1; //se coloca final, vira constante, então coloca caixa alta
		//total += 1;
		
		System.out.println(TOTAL);
	}

}
