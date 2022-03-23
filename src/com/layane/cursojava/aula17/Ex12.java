package com.layane.cursojava.aula17;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número entre 1 e 10 para gerar a tabuada");
		
		int num = scan.nextInt();
		
		System.out.println("Tabuada do " + num + ":");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + (num*i));
		}

	}

}
