package com.layane.cursojava.aula15;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor de A");
		
		double a = scan.nextDouble();
		
		
		if (a == 0) {
			System.out.println("Não é equação de segundo grau");
		} else {
			System.out.println("Digite o valor de B");
			double b = scan.nextDouble();
			System.out.println("Digite o valor de C");
			double c = scan.nextDouble();
			
			double delta = (b*b) - (4*a*c);
			System.out.println(delta);
			
			double raiz1 = 0;
			double raiz2 = 0;
			
			if(delta < 0) {
				System.out.println("A equação não possui raízes reais");
			} else {
				raiz1 = (-b + Math.sqrt(delta)) / (2*a);
				raiz2 = (-b - Math.sqrt(delta)) / (2*a);
				System.out.println(raiz1);
				System.out.println(raiz2);
			}
		}
		
		//delta (b*b) -4*a*c
		
		//baskara (-b + raiz delta) / 2*a
		
	}

}
