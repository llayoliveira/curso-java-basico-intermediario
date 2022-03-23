package com.layane.cursojava.aula13;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Coloque a temperatura em Farenheit");
		
		double farenheit = scan.nextDouble();
		
		double celsius = (5*(farenheit - 32)/9);
		
		System.out.println("A temperatura em graus Celsius é:" + celsius);
		
	}

}
