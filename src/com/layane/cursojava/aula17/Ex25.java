package com.layane.cursojava.aula17;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lojas Tabajara");
		
		boolean sair = false;
		String novaCompra, output = "";
		int qtdeProdutos;
		double total = 0, preco = 0, valorPago = 0;
		
		do {
			System.out.println("Deseja informar uma nova compra? S/N");
			 novaCompra = scan.next();		
			
			if(novaCompra.equalsIgnoreCase("s")) {
				System.out.println("Digite a quantidade de produtos da compra: ");
				qtdeProdutos = scan.nextInt();
				
				for(int i = 1; i <= qtdeProdutos; i++) {
					System.out.println("Informe o preço do produto : " + i);
					preco = scan.nextDouble();
					total += preco;
					output += "Produto " + i + ": R$ " + preco + "\n";
				}
				
				System.out.println("Lojas Tabajara");
				System.out.println(output);
				System.out.println("Total: " + total);
				
				System.out.println("Digite o valor pago: ");
				valorPago = scan.nextDouble();
				
				System.out.println("Troco: " + (valorPago - total));
			} else {
				sair = true;
			}
			
			
		}while(!sair);
		
		

	}

}
