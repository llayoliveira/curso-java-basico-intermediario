package com.layane.cursojava.aula19;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[10];
		int[] b = new int[a.length];
	
		for(int i = 0; i < a.length; i++) {
			System.out.println("Digite o valor da posição " + i + " do vetor A");
			a[i] = scan.nextInt();
			b[i] = a[i] % 2;
		}
		
		System.out.print("Valores de A = ");
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Valores de B = ");
		for(int i = 0; i < b.length; i++){
			System.out.print(b[i] + " ");
		}

	}
}

