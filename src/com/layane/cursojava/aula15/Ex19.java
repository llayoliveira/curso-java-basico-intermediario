package com.layane.cursojava.aula15;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");

		int num1 = scan.nextInt();
		
		System.out.println("Digite outro n�mero: ");

		int num2 = scan.nextInt();
		
		System.out.println("Qual opera�� deseja realizar? (1-Multiplica��o, 2-Divis�o, 3-Adi��o, 4-Subtra��o)");

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
			System.out.println("Opera��o n�o encontrada!");
		}
		
		System.out.println(calc);

		if(calc%2 == 0) {
			System.out.println("N�mero par");
		} else {
			System.out.println("N�mero �mpar");
		}
		
		if(calc >= 0) {
			System.out.println("N�mero positivo");
		} else {
			System.out.println("N�mero negativo");
		}
	}
}
	
