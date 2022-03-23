package com.layane.cursojava.aula33.labs;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno1 = new Aluno();
		
		System.out.println("Digite seu nome");
		aluno1.setNome(scan.next());
		
		System.out.println("Digite seu curso");
		aluno1.setCurso(scan.next());
		
		System.out.println("Digite a matrícula");
		aluno1.setMatricula(scan.next());
		
		for(int i = 0; i < aluno1.getDisciplinas().length; i++) {
			System.out.println("Digite o nome da disciplina " + (i+1));
			aluno1.setNomeDisciplinaPos(i, scan.next());
		}
		
		for(int i = 0; i < aluno1.getNotas().length; i++) {
			System.out.println("Obtendo notas da disciplina " + aluno1.getDisciplinas()[i]);
			for(int j = 0; j < aluno1.getNotas()[i].length; j++) {
				System.out.println("Digite a nota " + (j+1));
				aluno1.setNotasPos(i, j, scan.nextDouble());
			}
		}
		
		aluno1.mostrarInfo();
		
		for(int i = 0; i < aluno1.getDisciplinas().length; i++) {
			if(aluno1.verificarAprovacao(i)) {
				System.out.println("Disciplina " + aluno1.getDisciplinas()[i] + " - foi aprovado");
			} else {
				System.out.println("Disciplina " + aluno1.getDisciplinas()[i] + " - foi reprovado");
			}
		}
	
	}

}
