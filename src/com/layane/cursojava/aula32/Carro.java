package com.layane.cursojava.aula32;

public class Carro {
	private String marca;
	private String modelo;
	private int numPassageiros;
	private double capCombustivel;
	private double consumoCombustivel; //private não consigo acessar no TesteCarro
	
	public String getMarca() { //obter valor do atributo
		return this.marca;
	}
	
	public void setMarca(String marca) { //setar/atribuir valor ao atributo
		this.marca = marca; //atributo vai receber o parâmetro
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getCapCombustivel() {
		return capCombustivel;
	}

	public void setCapCombustivel(double capCombustivel) {
		this.capCombustivel = capCombustivel;
	}

	public int getNumPassageiros() {
		return this.numPassageiros;
	}
	
	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}

	public double getConsumoCombustivel() {
		return consumoCombustivel;
	}

	public void setConsumoCombustivel(double consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}
}
