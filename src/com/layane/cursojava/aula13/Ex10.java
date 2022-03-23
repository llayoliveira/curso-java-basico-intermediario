package com.layane.cursojava.aula13;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Coloque a temperatura em Celsius");
		
		double celsius = scan.nextDouble();
		
		double farenheit;
		
		farenheit = ((celsius*9)/5)+32;
		
		System.out.println("A temperatura em graus Farenheit é:" + farenheit);
	}

}
