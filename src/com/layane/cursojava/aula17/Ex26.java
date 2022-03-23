package com.layane.cursojava.aula17;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número");
		int num = scan.nextInt();
		int fat = 1;
		String output = "";
		
		for(int i = num; i > 1; i--) {
			fat *= i;
			output += i + " . ";
		}
		
		System.out.println("Fatorial de: " + num);
		System.out.println(num + "! = " + output + "1 = " + fat);

	}

}
