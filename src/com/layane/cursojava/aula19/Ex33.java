package com.layane.cursojava.aula19;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[10];
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Digite um número para o vetor A");
			a[i] = scan.nextInt();
		}
		
		boolean primo;
		String msg;
		
		for(int i = 0; i < a.length; i++) {
			primo = true;
			
			for(int j = 2; j < a[i]; j++) {
				if(a[i] % j == 0) {
					primo = false;
					break; //não adianta continuar verificando se vc sabe que não é
				}
			}
				msg = "";
			
				if(primo) {
					msg = " primo";
				} else {
					msg = " não é primo";
				}
				System.out.println(a[i] + msg);				
		}
	}

}
