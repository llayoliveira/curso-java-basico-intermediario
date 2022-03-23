package com.layane.cursojava.aula19;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[10];
		int[] b = new int[a.length];
		int[] c = new int[a.length];
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Digite um número para o vetor A");
			a[i] = scan.nextInt();
			
			System.out.println("Digite um número para o vetor B");
			b[i] = scan.nextInt();
			
			if(a[i] == b[i]) {
				c[i] = 0;
			} else if(a[i] > b[i]) {
				c[i] = 1;
			} else {
				c[i] = -1;
			}
		}
		
		System.out.print("Vetor A: ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
	
		}
		System.out.println();
		
		System.out.print("Vetor B: ");
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Vetor C: ");
		for(int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");	
		}
	}

}
