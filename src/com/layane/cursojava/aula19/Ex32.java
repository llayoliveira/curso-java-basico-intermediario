package com.layane.cursojava.aula19;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[]a = new int[5];
		
		for(int i= 0; i < a.length; i++) {
			System.out.println("Digite um valor para o vetor A");
			a[i] = scan.nextInt();
		}
		
		for(int i= 0; i < a.length; i++) {
			System.out.println("TABUADA DO " + a[i]);
			for(int j = 1; j <= 10; j++) {
				System.out.println(j + " x " + a[i] + " = " + j * a[i]);
			}
			System.out.println();
		}
		
	}

}
