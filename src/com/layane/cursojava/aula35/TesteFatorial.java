package com.layane.cursojava.aula35;

public class TesteFatorial {

	public static void main(String[] args) {

		int fatorialNR = Calculadora.fatorialNaoRecursivo(5);
		System.out.println(fatorialNR);
		
		int fatorialR = Calculadora.fatorial(5);
		System.out.println(fatorialR);
	}

}
