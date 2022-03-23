package com.layane.cursojava.aula15;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Telefonou para a vítima? (S ou N)");
		char p1 = scan.next().charAt(0);
		
		System.out.println("Esteve no local do crime? (S ou N)");
		char p2 = scan.next().charAt(0);
		
		System.out.println("Mora perto da vítima? (S ou N)");
		char p3 = scan.next().charAt(0);
		
		System.out.println("Devia para a vítima? (S ou N)");
		char p4 = scan.next().charAt(0);
		
		System.out.println("Já trabalhou com a vítima? (S ou N)");
		char p5 = scan.next().charAt(0);
		
		int qtde = 0;
		
		if(p1 == 'S') {
			qtde = qtde + 1;
			System.out.println(qtde);
		} 
		if(p2 == 'S') {
			qtde = qtde + 1;
			System.out.println(qtde);
		} 
		if(p3 == 'S') {
			qtde = qtde + 1;
			System.out.println(qtde);
		} 
		if(p4 == 'S') {
			qtde = qtde + 1;
			System.out.println(qtde);
		}	
		if(p5 == 'S') {
			qtde = qtde + 1;
			System.out.println(qtde);
		}
		
		if (qtde == 2) {
			System.out.println("Suspeita");
		} else if (qtde == 3 || qtde == 4) {
			System.out.println("Cúmplice");
		} else if (qtde == 5) {
			System.out.println("Assassino");
		} else {
			System.out.println("Inocente");
		}
	}

}
