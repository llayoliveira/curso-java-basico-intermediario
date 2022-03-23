package com.layane.cursojava.aula15;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		
		double valor = scan.nextDouble();
		
		if(valor >= 0) {
			System.out.println("Positivo");
		} else {
			System.out.println("Negativo");
		}
	}

}
