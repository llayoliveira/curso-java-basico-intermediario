package com.layane.cursojava.aula36.labs;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome do Curso");
		String nome = scan.nextLine();		
		
		System.out.println("Digite o horário");
		String horario = scan.nextLine();
		
		System.out.println("Digite o nome do professor");
		String nomeProf = scan.nextLine();
		
		System.out.println("Digite o departamento");
		String depProf = scan.nextLine();
		
		System.out.println("Digite o e-mail");
		String emailProf = scan.nextLine();
		
		Curso c = new Curso();
		c.setNome(nome);
		c.setHorario(horario);
		
		Professor p = new Professor();
		p.setNome(nomeProf);
		p.setDepartamento(depProf);
		p.setEmail(emailProf);
		
		c.setProfessor(p);
		
		Aluno[] alunos = new Aluno[5];
			
		for(int i = 0; i < alunos.length; i++) {
			scan.nextLine();
			System.out.println("Digite o nome do aluno " + (i + 1));
			String nomeAluno = scan.nextLine();
			
			System.out.println("Digite a matrícula");
			String matAluno = scan.nextLine();
			
			double[] notas = new double[4];
			
			for(int j = 0; j < 4; j++) {
				System.out.println("Nota " + (j + 1));
				notas[j] = scan.nextDouble();		
			}
			
			Aluno aluno = new Aluno();
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matAluno);
			aluno.setNotas(notas);
			
			alunos[i] = aluno;
		}
		
		c.setAlunos(alunos);
		
		System.out.println(c.obterInfo());
		
	}
}
