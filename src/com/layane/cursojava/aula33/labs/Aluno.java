package com.layane.cursojava.aula33.labs;

public class Aluno {
	private String nome;
	private String matricula;
	private String curso;
	private String[] disciplinas;
	private double[][] notas;
	
	public Aluno() {
		this.disciplinas = new String[3];
		this.notas = new double[3][4];
	}
	
	public Aluno(String nome, String matricula, String curso, String[] disciplinas, double[][] notas) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.disciplinas = new String[3];
		this.notas = new double[3][4];
	}


	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	public double[][] getNotas() {
		return notas;
	}

	public void setNotas(double[][] notas) {
		this.notas = notas;
	}

	public void mostrarInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Curso: " + curso);
		
		for(int i = 0; i < disciplinas.length; i++) {
			System.out.println("Notas da disciplina: " + disciplinas[i]);
			for(int j = 0; j < notas[i].length; j++) {
				System.out.print(notas[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	public boolean verificarAprovacao(int indice) {	
		if(obterMedia(indice) >= 7) {
			return true;
		} 
		
		return false; //poderia ser no else também
	}
	
	private double obterMedia(int indice) { //private - pq é método auxiliar
		double soma = 0;
		for(int i = 0; i < notas[indice].length; i++) {
			soma += notas[indice][i];
		}
		
		double media = soma /4;
		
		return media;
	}
	
	public void setNomeDisciplinaPos(int pos, String nomeDisciplina) {
		this.disciplinas[pos] = nomeDisciplina;
	}
	
	public void setNotasPos(int posL, int posC, double nota) {
		this.notas[posL][posC] = nota;
	}
}
