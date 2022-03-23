package com.layane.cursojava.aula19;

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[15];
		int[] b = new int[a.length];
		int fat;
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Digite um número");
			a[i] = scan.nextInt();
		}
		
		for(int i = 0; i < a.length; i++) {
			fat = 1;
			
			for(int j = 1; j <= a[i]; j++) {
				fat *= j;
			}
			
			b[i] = fat;
		}
		
		System.out.print("Vetor A = ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Vetor B = ");
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}

}
