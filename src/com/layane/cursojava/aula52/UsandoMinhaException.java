package com.layane.cursojava.aula52;

public class UsandoMinhaException {
	public static void main(String[] args) {
		try {
			teste();
		} catch (DivisaoNaoExata e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void teste() throws DivisaoNaoExata {
		int[] numeros = {4, 5, 8, 16, 21, 32, 64, 128};
		int[] denom = {2, 0, 4, 8, 0, 2, 4};
		

		for(int i = 0; i < numeros.length; i++) {
			try {
				if(numeros[i] % 2 != 0) {  //sempre que um número for ímpar, vou lançar a exception
					//throw new Exception("Número ímpar, divisão não exata"); //cria uma exception, mas é muito generalizada
					throw new DivisaoNaoExata(numeros[i], denom[i]);
				}
				System.out.println(numeros[i] + "/" + denom[i] + " = " + numeros[i]/denom[i]);
			} catch(ArithmeticException | ArrayIndexOutOfBoundsException e) { //A partir do Java 7, pode colocar catch da mesma família junto
				System.out.println("Ocorreu um erro");
				e.printStackTrace();
			} 
		}
	}
}

