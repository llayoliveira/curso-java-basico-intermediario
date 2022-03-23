package com.layane.cursojava.aula15;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");

		int num1 = scan.nextInt();
		
		System.out.println("Digite outro número: ");

		int num2 = scan.nextInt();
		
		System.out.println("Qual operaçã deseja realizar? (1-Multiplicação, 2-Divisão, 3-Adição, 4-Subtração)");

		int op = scan.nextInt();
		
		float calc = 0;
			
		
		if(op == 1) {
			calc = num1*num2;
		} else if(op == 2) {
			calc = num1/num2;
		} else if(op == 3) {
			calc = num1+num2;
		} else if(op == 4) {
			calc = num1-num2;
		} else {
			System.out.println("Operação não encontrada!");
		}
		
		System.out.println(calc);

		if(calc%2 == 0) {
			System.out.println("Número par");
		} else {
			System.out.println("Número ímpar");
		}
		
		if(calc >= 0) {
			System.out.println("Número positivo");
		} else {
			System.out.println("Número negativo");
		}
	}
}
	
