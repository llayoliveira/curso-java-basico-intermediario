package com.layane.cursojava.aula19;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[]a = new int[20];
		int[]b = new int[a.length];

		
		int pos = 0;
		
		for(int i= 0; i < a.length; i++) {
			System.out.println("Digite um valor para o vetor A");
			a[i] = scan.nextInt();
			
			if(a[i] % 2 == 0) {
				b[pos] = a[i];
				pos++;
			}
		}
		
		for(int i= 0; i < a.length; i++) {
			if(a[i] % 2 != 0) {
				b[pos] = a[i];
				pos++;
			}
		}
		
		System.out.print("Vetor A = ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Vetor B = ");
		for(int i = 0; i < pos; i++) {
			System.out.print(b[i] + " ");
		}
		
		
	}

}
