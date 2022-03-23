package com.layane.cursojava.aula45;

public class Teste2 {

	public static void main(String[] args) {
		Object obj1 = obterString();
		String s1 = (String) obj1;//downcasting
		
		Object obj2 = "Minha String";//upcasting
		String s2 = (String) obj2;//downcasting
		
		Object obj3 = new Object();
		String s3 = (String) obj3; //da erro na execução
		
		Object obj4 = obterInteiro();
		String s4 = (String) obj4;//da erro na execução, pq int não tem nada ver com String
	}
	
	
	
	//Object pode ser convertido por uma String quando faz referência a uma String
	public static String obterString() {
		return "minha String";
	}
	
	public static int obterInteiro() {
		return 1;
	}

}
