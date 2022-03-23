package com.layane.cursojava.aula27;

public class Lampada {
	String modelo;
	String marca;
	String tipoLuz;
	String cor;
	int potencia;
	String tensao;
	int garantiaMeses;
	String[] tipos; 
	
	boolean ligada;
	
	void ligar() {
		ligada = true;
	}
	
	void desligar() {
		ligada = false;
	}
	
	void mostrarEstado() {
		if(ligada) {
			System.out.println("Lâmpada está ligada");
		} else {
			System.out.println("Lâmpada está desligada");
		}
	}
	
	void mudarEstado() {
		if(ligada) {
			desligar();
		} else {
			ligar();
		}
	}
	
//	void desligarLampada() {
//		System.out.println("A lâmpada foi desligada");
//	}
//	
//	void ligarLampada() {
//		System.out.println("A lâmpada foi ligada");
//	}
//	
//	void desligarLigarLampada(int modo) {
//			if(modo == 1) {
//				System.out.println("A lâmpada foi ligada");
//			} else if(modo == 0) {
//				System.out.println("A lâmpada foi desligada");
//			}
//	} 
}
