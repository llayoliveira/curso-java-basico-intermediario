package com.layane.cursojava.aula17;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois n�meros separados por espa�o");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int soma = 0;
		
		for(int i = num1; i <= num2; i++) {
			System.out.println(i);
			soma += i;
		}
		
		System.out.println("Soma: " + soma);

	}

}
