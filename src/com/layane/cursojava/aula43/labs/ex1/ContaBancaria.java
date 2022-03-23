package com.layane.cursojava.aula43.labs.ex1;

public class ContaBancaria {
	private String nomeCliente;
	private String numConta;
	private double saldo;
	

	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public boolean sacar(double valor) {
		if (saldo >=  valor) {
			saldo -= valor; 
			return true;
		} else {
			return false;
		}	

	}
	
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public String toString() {
		String s = "ContaBancaria[";
		s += " nomeCliente: " + nomeCliente;
		s += "; numConta: " + numConta;
		s += "; saldo: " + saldo;
		s += "]";
		
		return s;
	}
	
	
	
}
