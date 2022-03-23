package com.layane.cursojava.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[15];
		double[] b = new double[a.length];//tipo diferente por causa do cálculo
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Digite o valor da posição " + i);
			a[i] = scan.nextInt();
			b[i] = Math.sqrt(a[i]);
		}
		
		System.out.print("Valores de A = ");
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		DecimalFormat df = new DecimalFormat("###,###.###");
		System.out.print("Valores de B = ");
		for(int i = 0; i < b.length; i++){
			System.out.print(df.format(b[i]) + " ");
		}
	}
}
