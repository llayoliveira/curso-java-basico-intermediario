package com.layane.cursojava.aula15;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu turno(M-Matutino ou V-Vespertino ou N-Noturno)");
		
		char turno = scan.next().charAt(0);
		
		switch(turno) {
		case 'M':
		case 'm': System.out.println("Bom dia!"); break;
		case 'V':
		case 'v': System.out.println("Boa tarde!"); break;
		case 'N':
		case 'n': System.out.println("Boa noite!"); break;
		default: System.out.println("Valor Inválido!"); break;
		}
	}
}
