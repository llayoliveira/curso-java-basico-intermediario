package com.layane.cursojava.aula17;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o preço do pão");
		
		double precoPao = scan.nextDouble();
		
		System.out.println("Preço do pão: R$ " + precoPao);
		System.out.println("Panificadora Pão de Ontem - Tabela de Preços");
		
		for(int i = 1; i <= 50; i++) {
			System.out.println(i + " - R$ " + (i * precoPao));
		}

	}

}
