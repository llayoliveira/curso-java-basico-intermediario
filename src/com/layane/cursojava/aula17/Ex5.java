package com.layane.cursojava.aula17;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int popA, popB;
		double taxaA, taxaB;
		
		boolean valido = false;
		do {
			System.out.println("Digite a qtde da população A");
			popA = scan.nextInt();
			
			if(popA > 0) {
				valido = true;
			} else {
				System.out.println("População dever ser maior que 0");
			}	
		}while(!valido);
		
		valido = false;
		do {
			System.out.println("Digite a qtde da população B");
			popB = scan.nextInt();
			
			if(popB > 0) {
				valido = true;
			} else {
				System.out.println("População dever ser maior que 0");
			}	
		}while(!valido);
		
		
		valido = false;
		do {
			System.out.println("Digite a taxa de cresc da população A");
			taxaA = scan.nextDouble();
			
			if(taxaA > 0) {
				valido = true;
			} else {
				System.out.println("População dever ser maior que 0");
			}	
		}while(!valido);
		
		valido = false;
		do {
			System.out.println("Digite a taxa de cresc da população B");
			taxaB = scan.nextDouble();
			
			if(taxaB > 0) {
				valido = true;
			} else {
				System.out.println("População dever ser maior que 0");
			}	
		}while(!valido);
			
		
		int anos = 0;
		
		while (popA < popB) {		
			popA += (popA/100) * 3;
			popB += (popB/100) * 1.5;
			anos++;
			
		}
		
		System.out.println("São necessários: "+ anos+ " anos, para a população de A igualar ou ultrapassar B");
		
		
	}

}
