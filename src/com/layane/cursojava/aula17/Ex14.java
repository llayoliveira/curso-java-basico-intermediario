package com.layane.cursojava.aula17;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num, par = 0, impar = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um número");
			num = scan.nextInt();
			
			if(num % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		
		System.out.println("Qtde números pares: " + par);
		System.out.println("Qtde números ímpares: " + impar);
	}

}
