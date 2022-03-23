package com.layane.cursojava.aula17;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");

		int num = scan.nextInt();
		
		boolean primo;
		
		for(int i = 1; i <= num; i++) {
			primo = true;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					primo = false;
				}
			}
			
			if(primo) {
				System.out.println(i);
			}
		}		
		
	}
}
	
