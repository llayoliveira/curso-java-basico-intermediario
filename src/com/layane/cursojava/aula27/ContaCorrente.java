package com.layane.cursojava.aula27;

import java.util.Scanner;

public class ContaCorrente {
	Scanner scan = new Scanner(System.in);
	
	String numero;
	String agencia;
	double saldo;
	boolean especial;
	double limite;
	
	char lim;
	
	void realizarSaque(double valor) {
		if(saldo >= valor) {
			System.out.println("Saque realizado com sucesso!");
			saldo = saldo - valor;
		} else if(saldo + limite >= valor) {
			System.out.println("Seu saldo n�o � suficiente, deseja retirar do limite(S/N)?");
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
	
	void depositarDinheiro(double valor) {
		System.out.println("Dep�sito realizado com sucesso!");
		saldo = saldo + valor;
	}
	
	double consultarSaldo() {
		return saldo;
	}
	
	void verificarEspecial() {
		if(especial) {
			System.out.println("Cliente est� usando o especial!");
		} else {
			System.out.println("Cliente n�o est� usando o especial!");
		}
	}
}
