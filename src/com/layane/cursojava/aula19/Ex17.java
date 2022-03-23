package com.layane.cursojava.aula19;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[10];
		int qtde = 0;
	
		for(int i = 0; i < a.length; i++) {
			System.out.println("Digite a idade da pessoa " + (i+1));
			a[i] = scan.nextInt();
			
			if(a[i] > 35) {
				qtde++;
			}
		}
		System.out.println("A quantidade de pessoas com mais de 35 anos é " + qtde);
	}

}
