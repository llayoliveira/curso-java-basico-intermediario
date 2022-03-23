package com.layane.cursojava.aula43.labs.ex1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Conta Banc�ria
		
		System.out.println("*** Teste Conta Banc�ria ***");
		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("Cliente conta simples");
		contaSimples.setNumConta("111111");
		
		contaSimples.depositar(100);
		
		realizarSaque(contaSimples, 50);
		
		realizarSaque(contaSimples, 70);
	
		System.out.println(contaSimples);
		
		
		
		//Conta Poupan�a
		System.out.println("*** Teste Conta Poupan�a ***");
		ContaPoupanca contaPoup = new ContaPoupanca(); //como a poup extende a bancaria, n�o tem problema colocar no m�todo do saque a bancaria(polimorfismo)
		contaPoup.setNomeCliente("Cliente conta poupan�a");
		contaPoup.setNumConta("222222");
		contaPoup.setDiaRendimento(2);
		
		contaPoup.depositar(100);
		
		realizarSaque(contaPoup, 50);
		
		realizarSaque(contaPoup, 70);
		
		if(contaPoup.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento aplicado, novo saldo � de = " + contaPoup.getSaldo());
		} else {
			System.out.println("Hoje n�o � dia de rendimento, novo saldo n�o calculado");
		}
	
		System.out.println(contaPoup);
		
		
		//Conta especial
		System.out.println("*** Teste Conta Especial ***");
		ContaEspecial contaEsp = new ContaEspecial();
		contaEsp.setNomeCliente("Cliente conta especial");
		contaEsp.setNumConta("33333");
		contaEsp.setLimite(50);
		
		contaEsp.depositar(100);
		
		realizarSaque(contaEsp, 50);
		
		realizarSaque(contaEsp, 70);
		
		realizarSaque(contaEsp, 40);
	
		System.out.println(contaEsp);
	}
	
	private static void realizarSaque(ContaBancaria conta, double valor) {
		if(conta.sacar(valor)) {
			System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
		} else{
			System.out.println("Saldo insuficiente para saque de " + valor + "; saldo = " + conta.getSaldo());
		}
	}

}
