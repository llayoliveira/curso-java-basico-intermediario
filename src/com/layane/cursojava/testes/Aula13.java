package com.layane.cursojava.testes;

import java.util.Scanner;

public class Aula13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o salário/hora e carga horária mensal");
		double salario = scan.nextDouble();
		double horas = scan.nextDouble();
		
		double salarioBruto = salario * horas;
		double inss = salarioBruto * 8 / 100;
		double sindicato = salarioBruto * 5 / 100;
		double impostoRenda = salarioBruto * 11 / 100;
		double descontos = inss + sindicato + impostoRenda;
		double salarioLiquido = salarioBruto - descontos;
		
		System.out.println("Salário Bruto: R$ " + salarioBruto 
				+ " - IR(11%): R$ " + impostoRenda
				+ " - INSS(8%): R$ " + inss
				+ " - Sindicato(5%): R$ " + sindicato
				+ " = Salário Líquido: R$ " + salarioLiquido);

	}

}
