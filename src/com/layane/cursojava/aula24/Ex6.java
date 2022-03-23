package com.layane.cursojava.aula24;

public class Ex6 {
	public static void main(String[] args) {
		Contato contato1 = new Contato();
		
		contato1.nome = "Layane";
		contato1.email = "lay2110@outlook.com";
		contato1.endereco = "Av. Silvano Faria, 1011";
		contato1.telefones = new String[2];
		
		contato1.telefones[0] = "(14) 98242-2121";
		contato1.telefones[1] = "(12) 3453-2322";
		
		Contato contato2 = new Contato();
		contato2.nome = "Carlos";
		
		System.out.println(contato1.nome);
		System.out.println(contato1.email);
		System.out.println(contato1.endereco);
		System.out.println(contato1.telefones[0]);
		
		System.out.println(contato2.nome);
		
	}
}
