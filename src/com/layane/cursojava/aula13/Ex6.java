package com.layane.cursojava.aula13;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual � o valor do raio do c�rculo?");
		
		double raio = scan.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A �rea do c�rculo �: " + area);
		
	}

}
