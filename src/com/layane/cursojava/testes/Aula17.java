package com.layane.cursojava.testes;

import java.util.Scanner;

public class Aula17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número para ver sua tabuada");
		int num = scan.nextInt();
		
		System.out.println("Tabuada do: " + num);
		for(int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + (num*i));
		}

	}

}
