package com.layane.cursojava.aula17;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número");
		int num = scan.nextInt();
		int fat = 1;
		
		for(int i = num; i > 0; i--) {
			fat *= i;
		}
		
		System.out.println(fat);
	}

}
