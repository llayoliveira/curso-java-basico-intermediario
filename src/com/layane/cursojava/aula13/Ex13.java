package com.layane.cursojava.aula13;

import java.util.Scanner;

public class Ex13 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto voc� ganha por hora?");
		
		double salarioHora = scan.nextDouble();
		
		System.out.println("Quantas horas voc� trabalha por m�s?");
		
		double horasMensais = scan.nextDouble();
		
		double salarioBruto = salarioHora * horasMensais;
		
		double inss = salarioBruto * 0.08;
		
		double sindicato = salarioBruto * 0.05;
		
		double ir = salarioBruto * 0.11;
		
		double totalDescontos = ir + inss + sindicato;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		
		System.out.println("O sal�rio bruto �: " + salarioBruto);
		System.out.println("O do valor inss �: " + inss);
		System.out.println("O pago ao sindicato �: " + sindicato);
		System.out.println("O sal�rio li�quido �: " + salarioLiquido);
	}

}
