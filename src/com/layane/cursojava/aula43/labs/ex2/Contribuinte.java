package com.layane.cursojava.aula43.labs.ex2;

public abstract class Contribuinte {
	private String nome;
	private double rendaBruta;
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public double getRendaBruta() {
		return rendaBruta;
	}

	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
	
	public abstract double calcularImposto();//forço as classes filhas a ter esse método, não tem {} pois é abstrato

	@Override
	public String toString() {
		String s = "Nome: " + nome;
		s += "; Renda Bruta: " + rendaBruta;
	
		return s;
	}

	
	
}
