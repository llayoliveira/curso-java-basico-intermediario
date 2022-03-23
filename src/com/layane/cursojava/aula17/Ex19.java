package com.layane.cursojava.aula17;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de notas");
		
		int qtde = scan.nextInt();
		
		double nota, soma = 0, media = 0;
		
		for(int i = 0; i < qtde; i++) {
			System.out.println("Digite a nota " + (i + 1));
			nota = scan.nextDouble();
			soma += nota;
		}
		
		media = soma/qtde;
		
		System.out.println(qtde);
		
		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + media);

	}

}
