package com.layane.cursojava.aula19;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[10];
		double soma = 0, qtdeQuinze = 0, qtde = 0, somaSup = 0, media = 0;
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Digite o valor da posição " + i);
			a[i] = scan.nextInt();
			
			if(a[i] < 15) {
				soma += a[i];
			} else if(a[i] == 15) {
				qtdeQuinze++;
			} else {
				somaSup += a[i];
				qtde++;
			}
		}
		
		media = somaSup/qtde;
		
		System.out.println("Soma dos elementos inferiores a 15: " + soma);
		System.out.println("Quantidade de elementos igual a 15: " + qtdeQuinze);
		System.out.println("Média dos elementos superiores a 15: " + media);
	}

}
