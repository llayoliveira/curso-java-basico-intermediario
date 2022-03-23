package com.layane.cursojava.aula17;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de CDs");
		
		int qtde = scan.nextInt();
		double valor, soma = 0, media = 0;
		for(int i = 0; i < qtde; i++) {
			System.out.println("Digite o valor do CD " + (i+1));
			valor = scan.nextDouble();
			soma += valor;
		}
		
		media = soma / qtde;
		
		System.out.println("Valor investido: " + soma);
		System.out.println("Valor médio de cada CD: " + media);
		
	}
}
