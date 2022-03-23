package com.layane.cursojava.aula18;

import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero");
		
		int num = scan.nextInt();
		
		System.out.println("Entre com um limite");
		int max = scan.nextInt();
		
		for(int i = num; i < max; i++) {
			System.out.println(i);
			if(i % 7 == 0) {
				System.out.println("O valor de i �: " + i);
				break; //interessado somente no primeiro
			}
		}
		
		for(int i = num; i < max; i++) {
			if(i % 7 == 0) {
				continue; //n�o imprime os m�ltiplos de 7
			}
			System.out.println(i);
		}
	}

}
