package com.layane.cursojava.aula13;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do arquivo em MB");
		double tamArquivo = scan.nextDouble();
		
		System.out.println("Digite a velocidade da internet");
		double velocidade = scan.nextDouble();
		
		double tempo = tamArquivo / velocidade;
		
		System.out.println("Tempo de download: " + tempo);
	}
}
