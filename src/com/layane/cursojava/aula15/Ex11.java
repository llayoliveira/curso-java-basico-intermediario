package com.layane.cursojava.aula15;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o salário: ");
		
		double salario = scan.nextDouble();
		
		double salarioNovo = 0;
		
		double aumento = 0;
		
		double porcent = 0;
		
		if(salario <= 280) {
			porcent = 20;
			aumento = salario * 0.2;
			salarioNovo = salario + aumento;
		} else if(salario > 280 && salario <= 700) {
			porcent = 15;
			aumento = salario * 0.15;
			salarioNovo = salario + aumento;
		} else if(salario > 700 && salario <= 1500) {
			porcent = 10;
			aumento = salario * 0.10;
			salarioNovo = salario + aumento;
		} else if(salario > 1500) {
			porcent = 5;
			aumento = salario * 0.05;
			salarioNovo = salario + aumento;
		}
		
		System.out.println("Salário antes do reajuste: " + salario);
		System.out.println("Percentual de aumento: " + porcent);
		System.out.println("Valor do aumento: " + aumento);
		System.out.println("Novo salário: " + salarioNovo);	
	}

}
