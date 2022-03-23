package com.layane.cursojava.aula33.labs;

public class Ex1 {
	public static void main(String[] args) {
		Lampada lamp = new Lampada();
		
		lamp.ligar();
		
		lamp.mostrarEstado();
		
		lamp.desligar();
		
		lamp.mostrarEstado();
		
		lamp.mudarEstado();
		
		lamp.mostrarEstado();
	}
}
