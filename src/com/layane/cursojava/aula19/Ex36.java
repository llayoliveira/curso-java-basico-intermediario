package com.layane.cursojava.aula19;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double[] a = new double[11];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = Math.pow(2, i);
		}
		
		
		System.out.print("Vetor A = ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}