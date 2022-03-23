package com.layane.cursojava.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[10];
		int soma = 0;
		float qtde = 0;
		double media = 0;
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Digite o valor da posição " + i);
			a[i] = scan.nextInt();
			
			if(a[i] % 2 != 0) {
				soma += a[i];
				qtde += 1;
			}
		}
		
		media = soma / qtde;
		
		DecimalFormat df = new DecimalFormat("###,###.##");
		System.out.println("Quantidade de elementos ímpares " + qtde);
		System.out.println("Média dos elementos ímpares = " + df.format(media));
	}

}
 