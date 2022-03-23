package com.layane.cursojava.aula85_100;

import java.util.Calendar;

public class Aula87Calendar {

	public static void main(String[] args) {
		Calendar hoje = Calendar.getInstance(); //singleton
		
		System.out.println(hoje);
		
		int ano = hoje.get(Calendar.YEAR);
		System.out.println(ano);
		
		int mes = hoje.get(Calendar.MONTH);
		System.out.println(mes);
		
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		System.out.println(dia);
		
		System.out.println(Calendar.JANUARY);
		
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		System.out.println(hora);
		
		int minutos = hoje.get(Calendar.MINUTE);
		System.out.println(minutos);
		
		int segundos = hoje.get(Calendar.SECOND);
		System.out.println(segundos);
		
		System.out.printf("Hoje é dia: %02d/%02d/%d Horário: %02d:%02d:%02d", dia, (mes + 1), ano, hora, minutos, segundos);

		hoje.add(Calendar.DAY_OF_MONTH, -1);
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
		
		//hoje.add(Calendar.DAY_OF_MONTH, 6);
		//System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
	}

}
