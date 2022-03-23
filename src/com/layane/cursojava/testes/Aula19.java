package com.layane.cursojava.testes;

public class Aula19 {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] b = {2, 2, 2,2,5,6,2,2,2,2};
		double[] c = new double[a.length];
		
		
		
		for(int i = 0; i < a.length; i++) {
			c[i] = a[i] / b[i];
			System.out.println(c[i]);
		}
	}

}
