package com.layane.cursojava.aula15;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade em KG de morango");
		
		int qtdemorango = scan.nextInt();

		System.out.println("Digite a quantidade em KG de maça");
		
		int qtdemaca = scan.nextInt();
		
		double precoKgMorango = 0;		
		if(qtdemorango <= 5) {
			precoKgMorango = 2.5;
		} else {
			precoKgMorango = 2.2;
		}
		
		double precoKgMaca = 0;		
		if(qtdemaca <= 5) {
			precoKgMaca = 1.8;
		} else {
			precoKgMaca = 1.5;
		}
		
		double precoTotalMorango = qtdemorango * precoKgMorango;
		double precoTotalMaca = qtdemaca * precoKgMaca;
		
		double precoParcial = precoTotalMorango + precoTotalMaca;
		double precoTotal = precoParcial;
		
		if((qtdemorango + qtdemaca > 8) || precoParcial > 25) {
			precoTotal = precoParcial - ((precoParcial/100)*10);
		}
		
		
		System.out.println("Valor pago: " + precoTotal);
	}

}
