package com.layane.cursojava.aula15;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois n�meros separados por espa�o");
		
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
		if(num1 > num2) {
			System.out.println("O maior n�mero � " + num1);
		} else {
			System.out.println("O maior n�mero � " + num2);
		}
	}

}
