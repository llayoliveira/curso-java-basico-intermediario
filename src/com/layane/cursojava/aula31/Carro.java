package com.layane.cursojava.aula31;

public class Carro {
	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	private double consumoCombustivel; //private n�o consigo acessar no TesteCarro
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro �: " + this.capCombustivel *this.consumoCombustivel);
	}

	double obterAutonomia() {
		System.out.println("M�todo obterAutonomia foi chamado.");
		return  this.capCombustivel * this.consumoCombustivel;
	}
	
	private double divideKmPorConsumo(double km) {
		return km/this.consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		return this.divideKmPorConsumo(km);
	}
}
