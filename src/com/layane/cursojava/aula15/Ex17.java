package com.layane.cursojava.aula15;

import java.util.Scanner;

public class Ex17 {
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Digite um ano: ");
		
		int ano = scan.nextInt();
		
		if(ano%4 == 0) {
			if(ano%100 != 0) {
				System.out.println("Ano bissexto");
			}
			else {
				System.out.println("Ano não bissexto");
			}
		} else {
			if(ano%400 == 0) {
				System.out.println("Ano bissexto");
			}
			System.out.println("Ano não bissexto");
		}
	}	
	}
	
