package com.layane.cursojava.aula27;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ContaCorrente conta = new ContaCorrente();

		double valor = 0;
	
		System.out.println("Digite o número da conta");
		conta.numero = scan.next();
		
		System.out.println("Digite o número da agência");
		conta.agencia = scan.next();
		
		System.out.println("Digite o saldo");
		conta.saldo = scan.nextDouble();
		
		System.out.println("Digite o limite");
		conta.limite = scan.nextDouble();
		
		System.out.println("Digite um valor para sacar");
		valor = scan.nextDouble();
		conta.realizarSaque(valor);
		System.out.println("Saldo: " + conta.consultarSaldo());
		
		System.out.println("Digite um valor para depositar");
		valor = scan.nextDouble();
		conta.depositarDinheiro(valor);
		
		System.out.println("Saldo: " + conta.consultarSaldo());
		
		conta.verificarEspecial();
	}

}
