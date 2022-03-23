package com.layane.cursojava.aula27;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Lampada lamp = new Lampada();
		
		lamp.ligar();
		
		lamp.mostrarEstado();
		
		lamp.desligar();
		
		lamp.mostrarEstado();
		
		lamp.mudarEstado();
		
		lamp.mostrarEstado();
		
		//Scanner scan = new Scanner(System.in);
		
//		System.out.println("Digite 1 para acender e 0 para apagar a lâmpada");
//		
//		int modo = scan.nextInt();
//		
//		lamp.desligarLigarLampada(modo);	
		
	}

}
