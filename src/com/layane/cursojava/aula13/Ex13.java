package com.layane.cursojava.aula13;

import java.util.Scanner;

public class Ex13 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora?");
		
		double salarioHora = scan.nextDouble();
		
		System.out.println("Quantas horas você trabalha por mês?");
		
		double horasMensais = scan.nextDouble();
		
		double salarioBruto = salarioHora * horasMensais;
		
		double inss = salarioBruto * 0.08;
		
		double sindicato = salarioBruto * 0.05;
		
		double ir = salarioBruto * 0.11;
		
		double totalDescontos = ir + inss + sindicato;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		
		System.out.println("O salário bruto é: " + salarioBruto);
		System.out.println("O do valor inss é: " + inss);
		System.out.println("O pago ao sindicato é: " + sindicato);
		System.out.println("O salário liíquido é: " + salarioLiquido);
	}

}
