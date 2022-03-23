package com.layane.cursojava.aula17;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de temperaturas");

		int qtde = scan.nextInt();
		
		double soma = 0, media = 0, temp, menor = Double.MAX_VALUE, maior = Double.MIN_VALUE;
		
		for(int i = 1; i <= qtde; i++) {
			System.out.println("Informe a temperatura " + i);
			temp = scan.nextDouble();
			soma += temp;
			
			if(menor > temp) {
				menor = temp;
			}
			
			if(maior < temp) {
				maior = temp;
			}
		}
		
		media = soma / qtde;
		
		System.out.println("Menor: " + menor);
		System.out.println("Maior: " + maior);
		System.out.println("Média: " + media);
		
	}

}
