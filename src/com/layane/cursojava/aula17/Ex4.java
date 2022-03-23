package com.layane.cursojava.aula17;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int popA = 80000;
		int popB = 200000;
		
		int anos = 0;
		
		while (popA < popB) {		
			popA += (popA/100) * 3;
			popB += (popB/100) * 1.5;
			anos++;
			
		}
		
		System.out.println("São necessários: "+ anos+ " anos, para a população de A igualar ou ultrapassar B");
		
		
	}

}
