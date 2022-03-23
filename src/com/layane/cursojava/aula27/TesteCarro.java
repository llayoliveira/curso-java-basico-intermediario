package com.layane.cursojava.aula27;

public class TesteCarro {
	public static void main(String[] args) {
		Carro van = new Carro(); //instância do carro
		
		//atribuição de valores
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		double autonomia = van.obterAutonomia();
		
		System.out.println("Autonomia: " + autonomia + " km");
		System.out.println("Autonomia: " + van.obterAutonomia());
	
		double qtdeCombustivel10 = van.calcularCombustivel(10);
		double qtdeCombustivel15 = van.calcularCombustivel(15);
		
		System.out.println("Qtde combustível 10 = " + qtdeCombustivel10);
		System.out.println("Qtde combustível 15 = " + qtdeCombustivel15);
	}
}
