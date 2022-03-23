package com.layane.cursojava.aula19;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[5];
		int[] b = new int[a.length];
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Digite o valor da posição: " + i);
			a[i] = scan.nextInt();
		}
			
		System.out.println("Valores A");
		
		for(int i = 0; i < a.length; i++) {
			b[i] = a[i];		
			System.out.println(a[i]);
		}
		
		System.out.println("Valores B");
		
		for(int bvalores : b) {		
			System.out.println(bvalores);
		}
	}

}
