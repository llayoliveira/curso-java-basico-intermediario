package com.layane.cursojava.aula13;

import java.util.Scanner;

public class Ex3 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero:");
		int num1 = scan.nextInt();
		
		System.out.println("Digite outro n�mero:");
		int num2 = scan.nextInt();
		
		int soma = num1 + num2;
		
		System.out.println("A soma dos dois n�meros � " + soma);
	}
}
