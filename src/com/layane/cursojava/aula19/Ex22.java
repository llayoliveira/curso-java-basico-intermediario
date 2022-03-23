package com.layane.cursojava.aula19;

public class Ex22 {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		double qtdeZero = 0;
		double qtdeUm = 0;
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = (int) Math.round(Math.random() * 1); //random gera um número de 0 a 1(double). Round = arredonda
		}
		
		for(double a : vetorA) {
			System.out.println(a);
		}
		
		
		for(double a : vetorA) { //for melhorado - tem acesso somente ao valor do array, usar quando não precisa do índice
			if(a == 0) {
				qtdeZero++;
			} else {
				qtdeUm++;
			}
		}
		
		System.out.println("Percentual de 0's: " + (qtdeZero/10)*100 + "%");
		System.out.println("Percentual de 1's: " + (qtdeUm/10)*100 + "%");
	}

}