package com.layane.cursojava.aula13;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois números inteiro e um real separados por espaço");
	
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		double num3 = scan.nextDouble();
		
		int calc1 = (num1 * 2) * (num2/2);
		double calc2 = (num1 * 3) + num3;
		double calc3 = Math.pow(num3,3);
		
		System.out.println("Calculo 1: " + calc1);
		System.out.println("Calculo 2: " + calc2);
		System.out.println("Calculo 3: " + calc3);
	}
}
