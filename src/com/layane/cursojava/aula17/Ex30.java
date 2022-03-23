package com.layane.cursojava.aula17;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		
		int num = scan.nextInt();
		
		System.out.println("Digite o valor inicial");
		
		int vrInicial = scan.nextInt();
		
		System.out.println("Digite o valor final");
		
		int vrFinal = scan.nextInt();
		
		System.out.println("Mostrar a tabuada de: " + num);
		System.out.println("Começar por: " + vrInicial);
		System.out.println("Terminar em: " + vrFinal);
		System.out.println("Vou mostrar a tabuada do " + num + " começando em " + vrInicial + " e terminando em " + vrFinal + ": ");
		for(int i = vrInicial; i <= vrFinal; i++) {
			System.out.println(num + " x " + i + " = " + (num*i));
		}

	}

}
