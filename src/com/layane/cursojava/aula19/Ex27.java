package com.layane.cursojava.aula19;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[10];
		char[] b = new char[a.length];
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Digite um número para o vetor A");
			a[i] = scan.nextInt();
			
			if(a[i] < 7) {
				b[i] = 'a';
			} else if(a[i] == 7){
				b[i] = 'b';
			} else if(a[i] > 7 && a[i] < 10) {
				b[i] = 'c';
			} else {
				b[i] = 'd';
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
	}

}
