package com.layane.cursojava.aula19;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double[] a = new double[20];
		double cotacao;
		
		System.out.println("Entre com a cotação do dólar");
		cotacao = scan.nextDouble();
		
		for(int i = 0; i < a.length; i++) {
			a[i] = cotacao * (i+1);
			
			System.out.println(a[i]);
		}
	}

}
