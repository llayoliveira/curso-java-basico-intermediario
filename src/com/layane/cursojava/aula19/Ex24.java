package com.layane.cursojava.aula19;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[10];
		
		boolean palindromo = true;
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Digite um número");
			a[i] = scan.nextInt();			
		}
		
		for(int i = 0; i < (a.length/2) ; i++) {
			if(a[i] != a[a.length - 1 - i]) {
				palindromo = false;
				break;
			}
		}
		
		if(palindromo) {
			System.out.println("Palindromo");
		} else {
			System.out.println("Não é palindromo");
		}
			
	}

}
