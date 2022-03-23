package com.layane.cursojava.aula17;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		 int num;
		 int maior = Integer.MIN_VALUE; //menor número possível
		 
		 for(int i = 0; i < 5; i++) {
			 System.out.println("Digite um número");
			 
			 num = scan.nextInt();
			 
			 if(num > maior) {
				 maior = num;
				 System.out.println("O número maior mudou para: " + maior);
			 }
		 }
		 
		 System.out.println("O maior número digitado foi: " + maior);
	}

}
