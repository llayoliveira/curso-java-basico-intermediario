package com.layane.cursojava.aula27;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado.");
		return  capCombustivel * consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		double qtdeCombustivel = km/consumoCombustivel;
		
		return qtdeCombustivel;
	}
}
