package com.layane.cursojava.aula17;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a qtde de termos");
		
		int n = scan.nextInt();
		int m = 1;
		String output = "";
		double soma = 1;
		
		output += "H = 1/" + m;
		for(int i = 2; i <= n; i++) {
			m += 1;
			output += " + 1/" + m;
			soma += 1/m;
		}
		
		System.out.println(output + " = " + soma);

	}

}
