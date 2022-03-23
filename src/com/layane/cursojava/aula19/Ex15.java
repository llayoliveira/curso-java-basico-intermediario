package com.layane.cursojava.aula19;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[10];
		double qtdePar = 0, qtdeImpar = 0;
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Digite o valor da posição " + i);
			a[i] = scan.nextInt();
			
			if(a[i] % 2 == 0) {
				qtdePar++;
				System.out.println(qtdePar);
			} else {
				qtdeImpar++;
				System.out.println(qtdeImpar);
			}
		}
		
		System.out.println("Percentual números pares = " + (qtdePar/10)*100 + "%");
		System.out.println("Percentual números ímpares = " + (qtdeImpar/10)*100 + "%");
		
	}

}
