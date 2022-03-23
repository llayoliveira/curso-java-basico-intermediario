package com.layane.cursojava.aula17;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean senhaValida = false;
		String user;
		String password; // criar as variáveis fora do looping(boa prática).
		
		do {
			System.out.println("Digite seu usuário");	
			user = scan.next();
			
			System.out.println("Digite sua senha");
			password = scan.next();
			
			if(user.equalsIgnoreCase(password)) {
				System.out.println("Digite uma senha diferente do usuário");
			} else {
				senhaValida = true;
				System.out.println("Cadastro realizado com sucesso");
			}
		} while (!senhaValida);
		
	}

}
