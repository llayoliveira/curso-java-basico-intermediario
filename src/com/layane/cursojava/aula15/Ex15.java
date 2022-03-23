package com.layane.cursojava.aula15;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite os lados do tri�ngulo separado por espa�o");
		
		double lado1 = scan.nextDouble();
		double lado2 = scan.nextDouble();
		double lado3 = scan.nextDouble();
		
		if((lado1 + lado2) > lado3 || (lado2 + lado3) > lado1 || (lado1 + lado3) > lado2) {
			if(lado1 == lado2 && lado1 == lado3) {
				System.out.println("Tri�ngulo equil�tero");
			} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3 ) {
				System.out.println("Tri�ngulo escaleno");
			} else {
				System.out.println("Tri�ngulo is�sceles");
			}
			
		} else {
			System.out.println("N�o � um tri�ngulo");
		}


	}

}
