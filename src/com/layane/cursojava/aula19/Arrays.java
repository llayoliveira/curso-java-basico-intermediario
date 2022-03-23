package com.layane.cursojava.aula19;

public class Arrays {
	public static void main(String[] args) {
		double[] temperaturas = new double[365]; //boa pr�tica declarar o tipo array, dps do tipo da vari�vel
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 33.1;
		
		System.out.println("O valor da temperatura do dia 3 �: " + temperaturas[2]);
	
		System.out.println("O  tamanho do array: " + temperaturas.length);
		
		System.out.println("Valores do array: " + temperaturas); //endere�o de mem�ria que o array est� apontando
	
		for(int i = 0; i < temperaturas.length; i++) { //vers�o padr�o para itera��o do array
			System.out.println("O valor da temperatura do dia " + (i+1) + " �: " + temperaturas[i]);
		}
		
		for(double temp : temperaturas) { //for melhorado - tem acesso somente ao valor do array, usar quando n�o precisa do �ndice
			System.out.println(temp);
		}
			
	}
}
