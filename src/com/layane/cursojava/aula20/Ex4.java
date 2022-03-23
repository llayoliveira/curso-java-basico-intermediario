package com.layane.cursojava.aula20;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		String[][] agenda = new String[31][24];

		boolean sair = false;
		boolean diaValido, horaValida;
		byte opcao;
		int dia = 0, hora = 0;
		
		while(!sair) {
			System.out.println("Digite 1 para adicionar compromisso");
			System.out.println("Digite 2 para verificar compromisso");
			System.out.println("Digite 0 para sair");
			
			opcao = scan.nextByte();
			
			if(opcao == 1) {  //adicionar compromisso
				diaValido = false;
				while(!diaValido) {
					System.out.println("Entre com o dia do mês");
					dia = scan.nextInt();
					if(dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido, digite novamente");
					}
				}	
				
				horaValida = false;
				while(!horaValida) {
					System.out.println("Entre com o horário");
					hora = scan.nextInt();
					if(hora >= 0 && hora <= 24) {
						horaValida = true;
					} else {
						System.out.println("Horário inválido, digite novamente");
					}
				}
				
				//ou dia--;
				System.out.println("Digite o compromisso");
				agenda[--dia][hora] = scan.next();
				
			} else if (opcao == 2) {    //verificar compromisso
				diaValido = false;
				while(!diaValido) {
					System.out.println("Entre com o dia do mês");
					dia = scan.nextInt();
					if(dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido, digite novamente");
					}
				}	
				
				horaValida = false;
				while(!horaValida) {
					System.out.println("Entre com o horário");
					hora = scan.nextInt();
					if(hora >= 0 && hora <= 24) {
						horaValida = true;
					} else {
						System.out.println("Horário inválido, digite novamente");
					}
				}
				
				dia--;
				System.out.println("O compromisso agendado é: ");
				System.out.println(agenda[dia][hora]);
			} else if (opcao == 0) {    
				sair = true;
			} else {
				System.out.println("Opção Inválida! Digite novamente.");
			}
		}
	}

}
