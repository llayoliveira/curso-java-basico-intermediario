package com.layane.cursojava.aula19;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[10];
		int[] b = new int[a.length];
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Digite um número");
			a[i] = scan.nextInt();
			
			b[i] = (a[i] % 2 == 0) ? 1 : 0;//if ternário
		}
		
		System.out.print("Vetor A: ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
	
		}
		
		System.out.println("Vetor B: ");
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
	
		}
	}

}
