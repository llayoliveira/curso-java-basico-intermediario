package com.layane.cursojava.aula20;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] m = new int[3][3];
		
		int pares = 0, impares = 0;
		
		
		//gerar matriz e determinar qtde de números pares e impares
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				System.out.println("Digite o valor da posição (" + i + "," + j + ")");
				m[i][j] = scan.nextInt();
				
				if(m[i][j] % 2 == 0) {
					pares++;
				} else {
					impares++;
				}
			}
		}
		
		//imprimir matriz
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Pares = " + pares);
		System.out.println("Ímpares = " + impares);
	}

}
