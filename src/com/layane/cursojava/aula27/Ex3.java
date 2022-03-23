package com.layane.cursojava.aula27;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno1 = new Aluno();
		
		System.out.println("Digite seu nome");
		aluno1.nome = scan.next();
		
		System.out.println("Digite seu curso");
		aluno1.curso = scan.next();
		
		System.out.println("Digite a matrícula");
		aluno1.matricula = scan.next();
		
		for(int i = 0; i < aluno1.disciplinas.length; i++) {
			System.out.println("Digite o nome da disciplina " + (i+1));
			aluno1.disciplinas[i] = scan.next();
		}
		
		for(int i = 0; i < aluno1.notas.length; i++) {
			System.out.println("Obtendo notas da disciplina " + aluno1.disciplinas[i]);
			for(int j = 0; j < aluno1.notas[i].length; j++) {
				System.out.println("Digite a nota " + (j+1));
				aluno1.notas[i][j] = scan.nextDouble();
			}
		}
		
		aluno1.mostrarInfo();
		
		for(int i = 0; i < aluno1.disciplinas.length; i++) {
			if(aluno1.verificarAprovacao(i)) {
				System.out.println("Disciplina " + aluno1.disciplinas[i] + " - foi aprovado");
			} else {
				System.out.println("Disciplina " + aluno1.disciplinas[i] + " - foi reprovado");
			}
		}
	
	}

}
