package com.layane.cursojava.aula15;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tipo da carne");
		
		String tipo = scan.next();

		System.out.println("Digite a quantidade");
		
		double qtdeCarne = scan.nextDouble();
		
		System.out.println("Digite o tipo de pagamento (1-Dinheiro, 2-Cartao, 3-Cartao Tabajara");
		
		int tipoPagamento = scan.nextInt();
		
		double precoKg = 0;
		
		if(tipo.equalsIgnoreCase("F")) {
			System.out.println("Tipo carne: Filé Duplo");
			if(qtdeCarne < 5) {
				precoKg = 4.9;
			} else {
				precoKg = 5.8;
			}
		} else if(tipo.equalsIgnoreCase("A")) {
			System.out.println("Tipo carne: Alcatra");
			if(qtdeCarne < 5) {
				precoKg = 5.9;
			} else {
				precoKg = 6.8;
			}
		} else if(tipo.equalsIgnoreCase("P")) {
			System.out.println("Tipo carne: Picanha");
			if(qtdeCarne < 5) {
				precoKg = 6.9;
			} else {
				precoKg = 7.8;
			}
		}
		
		System.out.println("Quantidade carne: " + qtdeCarne);
		
		double precoParcial = precoKg * qtdeCarne;
		double precoTotal = precoParcial;
		double vrDesc = 0;
		if(tipoPagamento == 3) {
			vrDesc = (precoParcial/100)*5;
			precoTotal = precoParcial - vrDesc;
			System.out.println("Tipo pagamento: Cartão Tabajara");
		} else if(tipoPagamento == 2) {
			System.out.println("Tipo pagamento: Cartão");
		} else {
			System.out.println("Tipo pagamento: Dinheiro");
		}
		
		System.out.println("Valor desconto: " + vrDesc);
		System.out.println("Preço Total: " + precoTotal);
		
		
		
	}

}

