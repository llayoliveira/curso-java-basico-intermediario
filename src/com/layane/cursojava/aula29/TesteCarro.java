package com.layane.cursojava.aula29;

public class TesteCarro {
	 public static void main(String[] args) {
		//----------------------------Exemplo 1----------------------------
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		//van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
			
		System.out.println(van.numPassageiros);
		
		//----------------------------Exemplo 2----------------------------
		Carro van2 = new Carro("Fiat", "Ducato", 30, 21, 0.4);
		
		System.out.println(van2.marca);
		System.out.println(van2.modelo);
		System.out.println(van2.numPassageiros);
		System.out.println(van2.capCombustivel);
		System.out.println(van2.consumoCombustivel);
	 }
}
