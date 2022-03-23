package com.layane.cursojava.aula13;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora?");
		
		double salarioHora = scan.nextDouble();
		
		System.out.println("Quantas horas você trabalha por mês");
		
		double horasMensais = scan.nextDouble();
		
		double salario = salarioHora*horasMensais;
		
		System.out.println("Seu salário mensal é: " + salario);
		
	}

}
