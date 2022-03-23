package com.layane.cursojava.aula36.labs;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome da agenda");
		String nome = scan.nextLine();
		
		Agenda agenda = new Agenda(nome); 
		
		
		Contato[] contatos = new Contato[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Digite as informações do contato " + (i + 1));
			Contato c = new Contato();
			System.out.println("Nome: ");
			c.setNome(scan.nextLine());
			System.out.println("E-mail: ");
			c.setEmail(scan.nextLine());
			System.out.println("Telefone: ");
			c.setTelefone(scan.nextLine());
			
			contatos[i] = c;
		}
		
		agenda.setContatos(contatos);
		
		if(agenda != null) {
			System.out.println(agenda.obterInfo());
		}
		

	}


}
