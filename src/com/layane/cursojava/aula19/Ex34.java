package com.layane.cursojava.aula19;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[5];
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Digite um valor para A");
			a[i] = scan.nextInt();
		}
		
		String msg = "";
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Analisando o número " + a[i]);
			
			for(int j = 2; j < a[i]; j++) {
				if(j % 2 == 0) {
					System.out.println(j + " é par");
				}
			}
			
			System.out.println();
			
		}
		
	}

}
