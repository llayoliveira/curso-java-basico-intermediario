package com.layane.cursojava.aula43.labs.ex3;

public class Peixe extends Animal {
	private String caracteristicas;
	
	public Peixe() {//construtor, quando instanciar essas vão ser as informações padrão
		super();
		this.setPatas(0);
		this.setAmbiente("Mar");
		this.setCor("Cinzento");
		this.caracteristicas = "barbatanas e cauda";
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += "\nCaracterísticas: " + caracteristicas;
		
		return s;
	}
	
	
	
}
