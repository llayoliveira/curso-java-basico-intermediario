package com.layane.cursojava.aula17;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean infoValida = false;
		String nome, sexo, estadoCivil;
		int idade;
		double salario;

		
		do {
			System.out.println("Digite seu nome");
			nome = scan.next();
			if(nome.length() >= 3) {
				infoValida = true;
			} else {
				System.out.println("Nome precisa no mínimo 3 caracteres");
			}
		} while(!infoValida);
		
		infoValida = false;
		do {
			System.out.println("Digite sua idade");
			idade = scan.nextInt();
			if(idade >= 0 && idade <= 150) {
				infoValida = true;
			} else {
				System.out.println("Informe uma idade entre 0 e 150");
			}		
		} while(!infoValida);
		
		infoValida = false;
		do {
			System.out.println("Digite seu salário");
			salario = scan.nextDouble();
			if(salario > 0 ) {
				infoValida = true;
			} else {
				System.out.println("Informe um salario maior que 0");
			}		
		} while(!infoValida);
		
		
		infoValida = false;
		do {
			System.out.println("Digite seu sexo (F/M)");
			sexo = scan.next();
			if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
				infoValida = true;
			} else {
				System.out.println("Sexo precisa ser 'f' ou 'm'");
			}		
		} while(!infoValida);
		
		
		infoValida = false;
		do {
			System.out.println("Digite seu estado civil(S/C/V/D)");
			estadoCivil = scan.next();
			if(estadoCivil.equalsIgnoreCase("s")||
					estadoCivil.equalsIgnoreCase("c")||
					estadoCivil.equalsIgnoreCase("d")||
					estadoCivil.equalsIgnoreCase("v")){
				infoValida = true;
			} else {
				System.out.println("Estado civil precisa ser 's', 'c', 'd' ou 'v'");
			}		
		} while(!infoValida);
		
		System.out.println("As seguintes informações foram coletadas:");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: R$ " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);


	}

}
