package com.layane.cursojava.aula15;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o pre�o dos tr�s produtos separados por espa�o");
		
		double valor1 = scan.nextDouble();
		double valor2 = scan.nextDouble();
		double valor3 = scan.nextDouble();

		if (valor1 < valor2 && valor1 < valor3) {
			System.out.println("Voc� deve comprar o produto 1");
		} else if (valor2 < valor1 && valor2 < valor3) {
			System.out.println("Voc� deve comprar o produto 2");
		} else {
			System.out.println("Voc� deve comprar o produto 3");
		}
	}

}
