package com.layane.cursojava.aula19;

public class Ex2 {

	public static void main(String[] args) {
		int[] a = new int[8];
		int[] b = new int[a.length];
		
		a[0] = 2;
		a[1] = 4;
		a[2] = 6;
		a[3] = 8;
		a[4] = 10;
		a[5] = 12;
		a[6] = 14;
		a[7] = 16;
		
		System.out.println("Valores B");
		for(int i = 0; i < a.length; i++) {
			b[i] = a[i] * 2;
			System.out.println(b[i]);
		}
	}

}
