package com.layane.cursojava.aula24;

public class Ex5 {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		conta.numero = "123456";
		conta.agencia = "134";
		conta.saldo = -10;
		conta.especial = true;
		conta.limite = 500;
		
		System.out.println("Conta: " + conta.numero + " = R$ " + conta.saldo);
	}

}
