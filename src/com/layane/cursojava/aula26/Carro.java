package com.layane.cursojava.aula26;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	double obterAutonomia() {
		System.out.println("M�todo obterAutonomia foi chamado.");
		return  capCombustivel * consumoCombustivel;
	}
}
