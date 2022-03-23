package com.layane.cursojava.aula19;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[10];
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Digite um número");
			a[i] = scan.nextInt();
			
			if(a[i] % 2 != 0) {
				break;
			}
			
		}
		
	}

}
