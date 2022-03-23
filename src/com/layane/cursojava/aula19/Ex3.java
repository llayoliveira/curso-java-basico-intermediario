package com.layane.cursojava.aula19;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[5];
		int[] b = new int[a.length];
		
		for(int i = 0; i < a.length; i++){
			System.out.println("Digite o valor da posição " + i);
			a[i] = scan.nextInt();
			b[i] = a[i] * a[i];
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
