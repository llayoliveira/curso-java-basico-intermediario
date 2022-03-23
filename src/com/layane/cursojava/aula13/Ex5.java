package com.layane.cursojava.aula13;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor em metro");
		
		double metro = scan.nextDouble();
		
		double cm = metro*100;
		
		System.out.println(metro + " metros é igual a " + cm + "cm");
	}

}
