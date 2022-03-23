package com.layane.cursojava.aula24;

public class Ex1 {

	public static void main(String[] args) {
		Lampada lamp = new Lampada();
		lamp.cor = "Amarela";
		lamp.garantiaMeses = 36;
		lamp.tensao = "Bivolt";
		lamp.modelo = "A60";
		
		lamp.tipos = new String[5];
		lamp.tipos[0] = "Abajur";
		lamp.tipos[1] = "Lampeões";
		
		System.out.println(lamp.tipos[0]);
		System.out.println(lamp.modelo);
	}

}
