package com.layane.cursojava.aula59;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

//import static java.lang.Math.*;//importa todos os métodos da classe Math

public class StaticImport {

	public static void main(String[] args) {

		double a = 2;
		double b = 3;
		double c = 4;
		
		System.out.println(Math.pow(a, b));
		System.out.println(Math.sqrt(c));
		
		System.out.println(pow(a, b));//tem que fazer o import
		System.out.println(sqrt(c));
		
		
	
	}

}
