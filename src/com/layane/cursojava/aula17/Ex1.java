package com.layane.cursojava.aula17;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean notaValida = false;
		
		do { 
			System.out.println("Digite uma nota entre 0 e 10");
			double nota = scan.nextDouble();
			
			if (nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("Você digitou: " + nota);
			} else {
				System.out.println("Nota inválida, digite novamente");
			}
		} while (!notaValida);
				

	}

}
