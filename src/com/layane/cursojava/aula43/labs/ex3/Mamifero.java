package com.layane.cursojava.aula43.labs.ex3;

public class Mamifero extends Animal {
	private String alimento;
	
	public Mamifero() {
		super();
		this.setAmbiente("Terra");
		this.alimento = "Mel"; //pode ser sem o this
		this.setCor("Castanho");
		
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += "\nAlimento: " + alimento;
		
		return s;
	}
	
	
}
