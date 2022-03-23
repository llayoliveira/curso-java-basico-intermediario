package com.layane.cursojava.aula17;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a qtde de termos");
		
		int n = scan.nextInt();
		int m = 1;
		String output = "";
		
		output += "S = 1/" + m;
		for(int i = 2; i <= n; i++) { //ou i =1, j=1; i<=n; i++, j+=2
			m += 2;
			output += " + " + i + "/" + m;
		}
		
		System.out.println(output);

	}

}
