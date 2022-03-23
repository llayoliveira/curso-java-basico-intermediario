package com.layane.cursojava.aula34.labs;

public class Contador {
	private static int cont;

	public static void zerarContador() {
		cont = 0;
	}
	
	public static void incrementarContador() {
		cont++;
	}
	
	public static int obterContador() {
		return cont;
	}
}
