package com.layane.cursojava.aula45;

public class Teste {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		Pessoa pessoaAluno = aluno; //upcasting
		
		Pessoa aluno1 = new Aluno(); //upcasting
		
		Pessoa aluno2 = (Pessoa) new Aluno(); //upcasting , () converte para o tipo Pessoa

		
		Pessoa aluno3 = new Pessoa();
		//Aluno aluno4 = aluno3;
		Aluno aluno4 = (Aluno) aluno3;
		
	}

}
