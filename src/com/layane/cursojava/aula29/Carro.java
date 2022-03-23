package com.layane.cursojava.aula29;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	Carro(){
		System.out.println("Classe carro foi instanciada");
		numPassageiros = 4; // se fosse sempre 4 pode deixar no construtor
	}
	
	Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_){ 
		marca = marca_; //geralmente não usa o _, mas fica confuso
		modelo = modelo_;
		numPassageiros = numPassageiros_;
		capCombustivel = capCombustivel_;
		consumoCombustivel = consumoCombustivel_;
	}
	
	double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado.");
		return  capCombustivel * consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		double qtdeCombustivel = km/consumoCombustivel;
		
		return qtdeCombustivel;
	}
}
