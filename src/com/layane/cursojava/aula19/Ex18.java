package com.layane.cursojava.aula19;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] idades = new int[10];
		int qtde = 0;
		int maior = idades[0]; //Integer.MIN_VALUE;
		int menor = idades[0]; //Integer.MAX_VALUE;
		int posMaior = 0, posMenor = 0;
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println("Digite a idade da pessoa " + (i+1));
			idades[i] = scan.nextInt();
					
			if(idades[i] > maior) {
				maior = idades[i];
				posMaior = i;
			}
			
			if(idades[i] < menor) {
				menor = idades[i];
				posMenor = i;
			}
		}
		System.out.println("Idade maior: " + maior + ". Posição: " + posMaior);
		System.out.println("Idade menor: " + menor + ". Posição: " + posMenor);
	}

}
