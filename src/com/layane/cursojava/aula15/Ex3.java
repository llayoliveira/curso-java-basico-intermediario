package com.layane.cursojava.aula15;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o sexo (F-M)");
		
		char sexo = scan.next().charAt(0);//pode ser String tmb, mas dentro da condição ficaria valor.equalsIgnoreCase("f"); Para comparar String não usa == e sim o equals, pois é um objeto.
		
		if(sexo == 'F' || sexo =='f') {
			System.out.println("Feminino");
		} else if (sexo == 'M' || sexo =='m') {
			System.out.println("Masculino");
		} else {
			System.out.println("Sexo inválido");
		}
	}

}
