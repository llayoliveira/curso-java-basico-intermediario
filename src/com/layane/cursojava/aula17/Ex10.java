package com.layane.cursojava.aula17;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois números separados por espaço");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		for(int i = num1; i <= num2; i++) {
			System.out.println(i);
		}

	}

}
