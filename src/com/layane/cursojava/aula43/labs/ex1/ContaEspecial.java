package com.layane.cursojava.aula43.labs.ex1;

public class ContaEspecial extends ContaBancaria{
	private double limite;
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public boolean sacar(double valor) {
		double saldoComLimite = this.getSaldo() + limite;
		if((saldoComLimite - valor) >= 0){
			this.setSaldo(this.getSaldo()-valor);
			return true;
		}
		
		return false;
		
	}

	@Override
	public String toString() {
		String s = "ContaEspecial[";
		s += " limite: " + limite;
		s += "; " + super.toString();
		s += "]";
		
		return s;
	}
	
	
}
