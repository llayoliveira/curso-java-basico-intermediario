package com.layane.cursojava.aula34.labs;

import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo número");
		int num2 = scan.nextInt();
		
		 imprimirTela(Calculadora.dividir(num1, num2));
		
		 imprimirTela(Calculadora.potencia(num1, num2));
		
		 imprimirTela(Calculadora.multiplicar(num1, num2));
		
		 imprimirTela(Calculadora.somar(num1, num2));
		
		 imprimirTela(Calculadora.subtrair(num1, num2));		
	}
	
	static void imprimirTela(int num) {
		System.out.println(num);
	}
}
