package com.layane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Digite seu nome completo:");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
	
		System.out.println("Digite seu primeiro nome");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é: " + primeiroNome);
	
		System.out.println("Digite a sua idade:");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Digite seu nome, idade, altura e se tem emprego");
		String nome = scan.next();
		int idade1 = scan.nextInt();
		double altura = scan.nextDouble();
		boolean emprego = scan.nextBoolean();
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade1);
		System.out.println("Altura: " + altura);
		System.out.println("Tem emprego: " + emprego);
		
	}

}
