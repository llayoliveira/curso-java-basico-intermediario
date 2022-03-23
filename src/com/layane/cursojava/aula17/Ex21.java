package com.layane.cursojava.aula17;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de turmas");
		
		int qtdeTurmas = scan.nextInt();
		int qtdeAlunos, soma = 0;
		
		for(int i = 0; i < qtdeTurmas; i++) {
			do {
				System.out.println("Digite a qtde de alunos da turma " + (i+1));
				qtdeAlunos = scan.nextInt();
			}while(qtdeAlunos > 40);
			
			soma += qtdeAlunos;
		}
		
		double media = soma / qtdeTurmas;
		System.out.println("Média: " + media);
	}

}
