package com.layane.cursojava.aula20;

public class MatrizTridimensional {
	public static void main(String[] args) {
		int[][][] a = new int[3][3][3];
		
		//colocar os valores na matriz
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				for(int k = 0; k < a[i][j].length; k++) {
					a[i][j][k] = i + j + k;
				}
			}
		}
		
		//imprimir matriz
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				for(int k = 0; k < a[i][j].length; k++) {
					System.out.print(a[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		//obter soma, soma pares e soma ímpares
		
		int soma = 0, somaPares = 0, somaImpares = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				for(int k = 0; k < a[i][j].length; k++) {
					soma += a[i][j][k];
					
					if(a[i][j][k] % 2 == 0) {
						somaPares += a[i][j][k];
					} else {
						somaImpares += a[i][j][k];
					}
				}			
			}
		}
		
		System.out.println("Soma dos elementos = " + soma);
		System.out.println("Soma dos elementos pares = " + somaPares);
		System.out.println("Soma dos elementos ímpares = " + somaImpares);
	
	}
}
