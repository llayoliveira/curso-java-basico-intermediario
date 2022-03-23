package com.layane.cursojava.aula17;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de pessoas");
		
		int qtde = scan.nextInt();
		
		int idade, soma = 0; 
		
		for(int i = 0; i < qtde; i++) {
			System.out.println("Digite sua idade: ");
			idade = scan.nextInt();
			soma += idade;		
		}
		
		double media = soma / qtde;
		
		if(media >= 0 && media <= 25) {
			System.out.println("Turma jovem");
		} else if(media >= 26 && media <= 60) {
			System.out.println("Turma adulta");
		} else {
			System.out.println("Turma idosa");
		}
	}

}
