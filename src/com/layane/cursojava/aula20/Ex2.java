package com.layane.cursojava.aula20;

import java.util.Random;

public class Ex2 {

	public static void main(String[] args) {
		int[][] numerosAleatorios = new int[10][10];
		
		Random gerar = new Random();
		
		int menor5 = Integer.MAX_VALUE;
		int menor7 = Integer.MAX_VALUE;
		int maior5 = Integer.MIN_VALUE;
		int maior7 = Integer.MIN_VALUE;
		
		//gerar matriz
		for(int i = 0; i < numerosAleatorios.length; i++) {
			for(int j = 0; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = gerar.nextInt(100);
			}
		}
		
		//imprimir matriz
		for(int i = 0; i < numerosAleatorios.length; i++) {
			for(int j = 0; j < numerosAleatorios[i].length; j++) {
				System.out.print(numerosAleatorios[i][j] + " ");
			}
			System.out.println();
		}
		
		//determinar maior e menor
		for(int i = 0; i < numerosAleatorios[5].length; i++) {
			if(numerosAleatorios[5][i] < menor5) {
				menor5 = numerosAleatorios[5][i];
			}
			
			if(numerosAleatorios[5][i] > maior5) {
				maior5 = numerosAleatorios[5][i];
			}
		}
		
		for(int i = 0; i < numerosAleatorios.length; i++) {
			if(numerosAleatorios[i][7] < menor7) {
				menor7 = numerosAleatorios[i][7];
			}
			
			if(numerosAleatorios[i][7] > maior7) {
				maior7 = numerosAleatorios[i][7];
			}
		}
		
		System.out.println("Linha 5");
		System.out.println("Menor valor: " + menor5);
		System.out.println("Maior valor: " + maior5);
		System.out.println();
		System.out.println("Linha 7");
		System.out.println("Menor valor: " + menor7);
		System.out.println("Maior valor: " + maior7);
	}

}
