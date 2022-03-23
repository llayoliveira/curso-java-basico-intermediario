package com.layane.cursojava.aula15;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois números separados por espaço");
		
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
		if(num1 > num2) {
			System.out.println("O maior número é " + num1);
		} else {
			System.out.println("O maior número é " + num2);
		}
	}

}
