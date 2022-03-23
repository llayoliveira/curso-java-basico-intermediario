package com.layane.cursojava.aula20;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		String[][][] agenda = new String[12][31][8];

		boolean sair = false;
		boolean mesValido, diaValido, horaValida;
		byte opcao;
		int mes = 0, dia = 0, hora = 0;
		
		while(!sair) {
			System.out.println("Digite 1 para adicionar compromisso");
			System.out.println("Digite 2 para verificar compromisso");
			System.out.println("Digite 0 para sair");
			
			opcao = scan.nextByte();
			
			if(opcao == 1) {  //adicionar compromisso
				mesValido = false;
				while(!mesValido) {
					System.out.println("Entre com o m�s");
					mes = scan.nextInt();
					if(mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("M�s inv�lido, digite novamente");
					}
				}	
				
				diaValido = false;
				while(!diaValido) {
					System.out.println("Entre com o dia do m�s");
					dia = scan.nextInt();
					if(dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inv�lido, digite novamente");
					}
				}	
				
				horaValida = false;
				while(!horaValida) {
					System.out.println("Entre com o hor�rio");
					hora = scan.nextInt();
					if(hora >= 8 && hora <= 15) {
						horaValida = true;
					} else {
						System.out.println("Hor�rio inv�lido, digite novamente");
					}
				}
				
				//ou dia--;
				System.out.println("Digite o compromisso");
				agenda[--mes][--dia][hora - 8] = scan.next();
				
			} else if (opcao == 2) {    //verificar compromisso
				mesValido = false;
				while(!mesValido) {
					System.out.println("Entre com o m�s");
					mes = scan.nextInt();
					if(mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("M�s inv�lido, digite novamente");
					}
				}	
				
				diaValido = false;
				while(!diaValido) {
					System.out.println("Entre com o dia do m�s");
					dia = scan.nextInt();
					if(dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inv�lido, digite novamente");
					}
				}	
				
				horaValida = false;
				while(!horaValida) {
					System.out.println("Entre com o hor�rio");
					hora = scan.nextInt();
					if(hora >= 8 && hora <= 15) {
						horaValida = true;
					} else {
						System.out.println("Hor�rio inv�lido, digite novamente");
					}
				}
				
				dia--;
				mes--;
				hora = hora - 8;
				System.out.println("O compromisso agendado �: ");
				System.out.println(agenda[mes][dia][hora]);
			} else if (opcao == 0) {    
				sair = true;
			} else {
				System.out.println("Op��o Inv�lida! Digite novamente.");
			}
		}
	}

}
