package com.layane.cursojava.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		int[] notas = new int[10];
		
		Random random = new Random();
		
		for(int i = 0; i < notas.length; i++) {
			notas[i] = random.nextInt(10);
		}
		
		//for normal
		for(int i = 0; i < notas.length; i++) {
			int nota = notas[i];
			System.out.print(nota);
		}
		
		System.out.println();
		
		//for each
		for(int nota : notas) {  
			System.out.print(nota); //for each usando tipos primitivos(int,boolean,char...) não funciona leitura de valores (scan); NÃO PODE setar valores
		}
		
		System.out.println();
		
		//exemplo 2 - matriz
		System.out.println("Exemplo com arrays multidimensionais");
		double[][] notasAlunos = new double[3][4]; //instanciou
		
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;
		
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;
		
		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;
		
		for(double[] notasAluno : notasAlunos) { //passa por cada aluno
			for(double nota: notasAluno) {       //passa por cada nota desse aluno
				System.out.print(nota + " ");
			}
			System.out.println();
		}
	}

}
