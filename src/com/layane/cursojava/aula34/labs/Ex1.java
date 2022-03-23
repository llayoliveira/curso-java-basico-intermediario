package com.layane.cursojava.aula34.labs;

public class Ex1 {
	
	static void imprimirValor() {
		System.out.println(Contador.obterContador());
	}
	
	public static void main(String[] args) {
		imprimirValor();
		
		Contador.incrementarContador();
		
		imprimirValor();
		
		Contador.zerarContador();
		
		imprimirValor();
		
		Contador.incrementarContador();
		Contador.incrementarContador();
		Contador.incrementarContador();
		
		imprimirValor();
	}
}
