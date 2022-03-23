package com.layane.cursojava.aula15;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");

		int num = scan.nextInt();
		
		if(num%2 == 0) {
			System.out.println("Número par");
		} else {
			System.out.println("Número ímpar");
		}
	}

}
