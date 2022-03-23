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
				if(numeros[i] % 2 != 0) {  //sempre que um n�mero for �mpar, vou lan�ar a exception
					//throw new Exception("N�mero �mpar, divis�o n�o exata"); //cria uma exception, mas � muito generalizada
					throw new DivisaoNaoExata(numeros[i], denom[i]);
				}
				System.out.println(numeros[i] + "/" + denom[i] + " = " + numeros[i]/denom[i]);
			} catch(ArithmeticException | ArrayIndexOutOfBoundsException e) { //A partir do Java 7, pode colocar catch da mesma fam�lia junto
				System.out.println("Ocorreu um erro");
				e.printStackTrace();
			} 
		}
	}
}

