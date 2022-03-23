package com.layane.cursojava.aula15;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da hora trabalhada");
		
		double salarioHora = scan.nextDouble();
		
		System.out.println("Quantas horas mensais?");
	
		double horas = scan.nextDouble();	
		double salarioBruto = salarioHora * horas;		
		double porcentIR = 0;
		double ir = 0;		
		double inss = 0;			
		double fgts = 0;		
		double descontos = 0;
		double salarioLiquido = 0;
		
		if(salarioBruto <= 900) {
			ir = 0;
		} else if (salarioBruto > 900 && salarioBruto <= 1500) {
			ir = salarioBruto * 0.05;
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			ir = salarioBruto * 0.10;
		} else if (salarioBruto > 2500) {
			ir = salarioBruto * 0.20;
		}
		
		inss = salarioBruto * 0.10;
		fgts = salarioBruto * 0.11;
		descontos = ir + inss;
		salarioLiquido = salarioBruto - descontos;	
		
		System.out.println("Salário Bruto: (" + horas + " * " + salarioHora + ")" + " : R$ " + salarioBruto);
		System.out.println("(-) IR (" + porcentIR + "%) : R$ " + ir);
		System.out.println("(-) INSS (10%) : R$ " + inss);
		System.out.println("FGTS (11%) : R$ " + fgts);
		System.out.println("Total de descontos : R$ " + descontos);
		System.out.println("Salário líquido : R$ " + salarioLiquido);
	}
}
