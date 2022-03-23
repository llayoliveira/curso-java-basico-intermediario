package com.layane.cursojava.aula17;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean naoTerminar = true;
		int cod, qtde;
		double total = 0;
		String output = "";
		
		do {
			System.out.println("Digite o código e a quantidade. Digite 0 0  para sair.");
			cod = scan.nextInt();
			qtde = scan.nextInt();
			
			if(cod == 0 && qtde == 0) {
				naoTerminar = false;
				output += "Total: " + total;
			} else {
				switch(cod) {
				case 100: output += "Cachorro quente -> 1,20 * " + qtde;
						  output += " = " + (1.20 * qtde) + "\n";
						  total += 1.20 * qtde;
						  break;
				case 101: output += "Bauru simples -> 1,30 * " + qtde;
				  		  output += " = " + (1.30 * qtde) + "\n";
				  		  total += 1.30 * qtde;
				  		  break;
				case 102: output += "Bauru com ovo -> 1,50 * " + qtde;
				  		  output += " = " + (1.50 * qtde) + "\n";
				  		  total += 1.50 * qtde;
				  		  break;
				case 103: output += "Hamburguer -> 1,20 * " + qtde;
						  output += " = " + (1.20 * qtde) + "\n";
						  total += 1.20 * qtde;
						  break;
				case 104: output += "Cheeseburguer -> 1,30 * " + qtde;
						  output += " = " + (1.30 * qtde) + "\n";
						  total += 1.30 * qtde;
						  break;
				case 105: output += "Refrigerante -> 1,00 * " + qtde;
						  output += " = " + (1.00 * qtde) + "\n";
						  total += 1.00 * qtde;
						  break;
				}
			}
			
		
		}while(naoTerminar);
		
		System.out.println(output);
	}	

}
