package com.layane.cursojava.aula19;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[10];
		int soma = 0;
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Digite o valor da posi��o " + i);
			a[i] = scan.nextInt();
			
			soma += a[i];
		}
		
		System.out.println("Soma dos elementos = " + soma);
	}

}
