package com.layane.cursojava.aula17;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num, soma = 0;
		double media;

		for(int i = 0; i < 5; i++) {
			System.out.println("Digite um número");
			 
			 num = scan.nextInt();
			 
			 soma += num;
		}
		
		media = soma/5;
		
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
		
	}

}
