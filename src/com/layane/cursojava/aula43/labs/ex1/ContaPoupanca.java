package com.layane.cursojava.aula43.labs.ex1;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{
	private int diaRendimento;
	
	public int getDiaaRendimento() {
		return diaRendimento;
	}
	
	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	public boolean calcularNovoSaldo(double taxaRendimento) {
		Calendar hoje = Calendar.getInstance(); //obt�m a data de hoje no java
		
		if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		String s = "ContaPoupan�a[";
		s += " diaRendimento: " + diaRendimento;
		s += "; " + super.toString(); //vai chamar o m�todo da classe m�e
		s += "]";
		
		return s;
	}
	
	
}
