package com.layane.cursojava.aula19;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[10];
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Digite um valor para A");
			a[i] = scan.nextInt();
		}
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Divisores do " + a[i]);
			for(int j = 1; j < a[i]; j++) {
				if(a[i] % j == 0) {
					System.out.print (j + " ");
				}
			}
			System.out.println();
		}
		
	}

}
