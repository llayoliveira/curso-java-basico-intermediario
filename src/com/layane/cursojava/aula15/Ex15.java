package com.layane.cursojava.aula15;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite os lados do triângulo separado por espaço");
		
		double lado1 = scan.nextDouble();
		double lado2 = scan.nextDouble();
		double lado3 = scan.nextDouble();
		
		if((lado1 + lado2) > lado3 || (lado2 + lado3) > lado1 || (lado1 + lado3) > lado2) {
			if(lado1 == lado2 && lado1 == lado3) {
				System.out.println("Triângulo equilátero");
			} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3 ) {
				System.out.println("Triângulo escaleno");
			} else {
				System.out.println("Triângulo isósceles");
			}
			
		} else {
			System.out.println("Não é um triângulo");
		}


	}

}
