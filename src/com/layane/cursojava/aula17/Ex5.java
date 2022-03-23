package com.layane.cursojava.aula17;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int popA, popB;
		double taxaA, taxaB;
		
		boolean valido = false;
		do {
			System.out.println("Digite a qtde da popula��o A");
			popA = scan.nextInt();
			
			if(popA > 0) {
				valido = true;
			} else {
				System.out.println("Popula��o dever ser maior que 0");
			}	
		}while(!valido);
		
		valido = false;
		do {
			System.out.println("Digite a qtde da popula��o B");
			popB = scan.nextInt();
			
			if(popB > 0) {
				valido = true;
			} else {
				System.out.println("Popula��o dever ser maior que 0");
			}	
		}while(!valido);
		
		
		valido = false;
		do {
			System.out.println("Digite a taxa de cresc da popula��o A");
			taxaA = scan.nextDouble();
			
			if(taxaA > 0) {
				valido = true;
			} else {
				System.out.println("Popula��o dever ser maior que 0");
			}	
		}while(!valido);
		
		valido = false;
		do {
			System.out.println("Digite a taxa de cresc da popula��o B");
			taxaB = scan.nextDouble();
			
			if(taxaB > 0) {
				valido = true;
			} else {
				System.out.println("Popula��o dever ser maior que 0");
			}	
		}while(!valido);
			
		
		int anos = 0;
		
		while (popA < popB) {		
			popA += (popA/100) * 3;
			popB += (popB/100) * 1.5;
			anos++;
			
		}
		
		System.out.println("S�o necess�rios: "+ anos+ " anos, para a popula��o de A igualar ou ultrapassar B");
		
		
	}

}
