package com.layane.cursojava.aula45;

public class Teste3 {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		Aluno aluno = new Aluno();
		
		Professor prof = new Professor();
		
		if(pessoa instanceof Pessoa) {
			System.out.println("� do tipo Pessoa");
		}
		
		if(aluno instanceof Aluno) {
			System.out.println("� do tipo Aluno");
		}
		
		if(prof instanceof Professor) {
			System.out.println("� do tipo Professor");
		}

	}

}
