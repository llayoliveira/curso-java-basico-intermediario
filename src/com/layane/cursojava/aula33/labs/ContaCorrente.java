package com.layane.cursojava.aula33.labs;

import java.util.Scanner;

public class ContaCorrente {
	Scanner scan = new Scanner(System.in);
	
	private String numero;
	private String agencia;
	private double saldo;
	private boolean especial;
	private double limite;
	
	private char lim;
	
	public ContaCorrente(){ }
	
	public ContaCorrente(String numero, String agencia, double saldo, boolean especial, double limite, char lim) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.especial = especial;
		this.limite = limite;
		this.lim = lim;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getAgencia() {
		return agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean isEspecial() {
		return especial;
	}
	
	public void setEspecial(boolean especial) {
		this.especial = especial;
	}
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public char getLim() {
		return lim;
	}

	public void setLim(char lim) {
		this.lim = lim;
	}

	public void realizarSaque(double valor) {
		if(saldo >= valor) {
			System.out.println("Saque realizado com sucesso!");
			saldo = saldo - valor;
		} else if(saldo + limite >= valor) {
			System.out.println("Seu saldo não é suficiente, deseja retirar do limite(S/N)?");
			lim = scan.next().charAt(0);
			
			if(lim == 'S'){
				System.out.println("Saque realizado com sucesso!");
				limite = (saldo+limite) - valor;
				saldo = 0;
				especial = true;
			} else {
				System.out.println("Limite insuficiente!");
			}
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	public void depositarDinheiro(double valor) {
		System.out.println("Depósito realizado com sucesso!");
		saldo = saldo + valor;
	}
	
	public double consultarSaldo() {
		return saldo;
	}
	
	public void verificarEspecial() {
		if(especial) {
			System.out.println("Cliente está usando o especial!");
		} else {
			System.out.println("Cliente não está usando o especial!");
		}
	}
}
