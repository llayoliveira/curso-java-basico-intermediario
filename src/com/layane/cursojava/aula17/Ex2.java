package com.layane.cursojava.aula17;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean senhaValida = false;
		String user;
		String password; // criar as vari�veis fora do looping(boa pr�tica).
		
		do {
			System.out.println("Digite seu usu�rio");	
			user = scan.next();
			
			System.out.println("Digite sua senha");
			password = scan.next();
			
			if(user.equalsIgnoreCase(password)) {
				System.out.println("Digite uma senha diferente do usu�rio");
			} else {
				senhaValida = true;
				System.out.println("Cadastro realizado com sucesso");
			}
		} while (!senhaValida);
		
	}

}
