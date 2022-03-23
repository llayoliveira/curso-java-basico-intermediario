package com.layane.cursojava.aula19;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[10];
		int qtde = 0;
		
		for(int i = 0; i < a.length; i++){
			System.out.println("Digite o valor da posição " + i);
			a[i] = scan.nextInt();
			
			if(a[i] % 2 == 0) {
				qtde += 1;
			}
		}
		
		System.out.println("Quantidade de elementos pares " + qtde);
		
	}

}
