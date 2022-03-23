package com.layane.cursojava.aula19;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double[] notas1 = new double[10];
		double[] notas2 = new double[10];
		double[] result = new double[10];
		
		for(int i = 0; i < notas1.length; i++) {
			System.out.println("Digite a primeira nota do aluno " + (i+1));
			notas1[i] = scan.nextDouble();
			
			System.out.println("Digite a segunda nota do aluno " + (i+1));
			notas2[i] = scan.nextDouble();
			
			result[i] = (notas1[i] + notas2[i]) / 2;
		}
		
		for(int i = 0; i < result.length; i++) { 
			if(result[i] >= 7) {
				System.out.println("Aluno " + (i+1) + " está APROVADO com média " + result[i]);
			} else {
				System.out.println("Aluno " + (i+1) + " será REPROVADO com média " + result[i]);
			}
			
		}
	}

}
