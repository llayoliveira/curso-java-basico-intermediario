package com.layane.cursojava.aula17;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o pre�o do p�o");
		
		double precoPao = scan.nextDouble();
		
		System.out.println("Pre�o do p�o: R$ " + precoPao);
		System.out.println("Panificadora P�o de Ontem - Tabela de Pre�os");
		
		for(int i = 1; i <= 50; i++) {
			System.out.println(i + " - R$ " + (i * precoPao));
		}

	}

}
