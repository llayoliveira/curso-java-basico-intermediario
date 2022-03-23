package com.layane.cursojava.aula15;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade em litros");
		
		double litros = scan.nextDouble();
		
		System.out.println("Digite o tipo de combustível: A-Alcool/ G-Gasolina");
		
		String tipo = scan.next();
		
		double precoGas = 2.5;
		double precoAlc = 1.9;
		
		int percDesconto = 0;
		double total = 0;
		double totalDesc = 0;
				
		if(tipo.equalsIgnoreCase("a")) {
			if(litros <= 20) {
				percDesconto = 3;
			} else {
				percDesconto = 5;
			}
			total = litros * precoAlc;
			
		} else if(tipo.equalsIgnoreCase("g")) {
			if(litros <= 20) {
				percDesconto = 4;
			} else {
				percDesconto = 6;
			}
			total = litros * precoGas;
			
		}
		
		totalDesc = (total/100)*percDesconto;
		double precoAPagar = total - totalDesc;
		
		System.out.println("Valor: " + precoAPagar);
	}
}
