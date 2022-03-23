package com.layane.cursojava.aula13;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual é o valor da lateral do quadrado?");
		
		int lado = scan.nextInt();
		
		int area = lado*lado;
		
		int dobro = 2 * area;
		
		System.out.println("O dobro da área do quadrado é: " + dobro);
		
	}

}
