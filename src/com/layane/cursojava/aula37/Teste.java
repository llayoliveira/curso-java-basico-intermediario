package com.layane.cursojava.aula37;

public class Teste {

	public static void main(String[] args) {
/*		Aluno aluno = new Aluno(); //declara o tipo da classe filha e tem as informações da superclasse através do extends
		
		Professor professor = new Professor();
		
		Pessoa pessoa = new Pessoa();
		
		aluno.setNome("Layane");*/
		
		Pessoa aluno = new Aluno(); // se declarar dessa forma ele só tem acesso aos métodos da superclasse(Pessoa)
		
		Pessoa professor = new Professor(); //declara a superclasse e instancia o tipo da classe filha - Polimorfismo
		
		
	}

}
