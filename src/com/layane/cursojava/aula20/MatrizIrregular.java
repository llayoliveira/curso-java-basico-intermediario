package com.layane.cursojava.aula20;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o números de pessoas que serão entrevistadas: ");
		int numEntrevistados = scan.nextInt();
	
		String[][] nomesFilhos = new String[numEntrevistados][];
		int qtdeFilhos;
		
		for(int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("Digite a quantidade de filhos");
			qtdeFilhos = scan.nextInt();
			
			nomesFilhos[i] = new String[qtdeFilhos]; //cria um vetor para cada linha
		
			for(int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println("Digite o nome do filho " + (j+1));
				nomesFilhos[i][j] = scan.next();
			}
		}
		
		for(int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("Pessoa " + i + " tem " + nomesFilhos[i].length + " filhos.");
			for(int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println(nomesFilhos[i][j]);
			}
		}
	}

}
