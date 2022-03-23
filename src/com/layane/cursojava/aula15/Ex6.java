package com.layane.cursojava.aula15;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite três números separados por espaço");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("O maior número é " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O maior número é " + num2);
		} else {
			System.out.println("O maior número é " + num3);
		}
	}

}
