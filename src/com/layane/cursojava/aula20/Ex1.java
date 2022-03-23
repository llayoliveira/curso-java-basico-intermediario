package com.layane.cursojava.aula20;

import java.util.Random;

public class Ex1 {

	public static void main(String[] args) {
		int[][] numerosAleatorios = new int[4][4];
		
		Random numeroRandom = new Random();
		
		int maior = Integer.MIN_VALUE;
		int linha = 0, col = 0;
		
		//gerar matriz e determinar maior valor
		for(int i = 0; i < numerosAleatorios.length; i++) {
			for(int j = 0; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(10);
			
				if(numerosAleatorios[i][j] > maior) {
					maior = numerosAleatorios[i][j];
					linha = i;
					col = j;
				}
			}
		}
		
		//imprimir matriz
		for(int i = 0; i < numerosAleatorios.length; i++) {
			for(int j = 0; j < numerosAleatorios[i].length; j++) {
				System.out.print(numerosAleatorios[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("O Maior número da matriz é " + maior);
		System.out.println("Posição (" + linha + "," + col + ")");

	}

}
