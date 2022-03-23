package com.layane.cursojava.aula43;

import java.util.Arrays;
import java.util.Objects;

public class Aluno { 
	private String curso;
	private double[] notas;
		
	public Aluno() { 

	}
	
	
	public Aluno(String nome, String endereco, String telefone, String curso) {
		this.curso = curso;
	}


	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double calcularMedia() {
		return 0;
	}
	
	
	public boolean verificarAprovado() {
		return true;
	}

	public String obterEtiquetaEndereco() {
		String s = "Endere�o do Aluno: ";
		return s;
	}


	public void imprimirEtiquetaEndereco() {
		System.out.println(this.obterEtiquetaEndereco());
	}


	
//	public String toString() {
//		String s = curso + "\n";
//		
//		for(double nota: notas) {
//			s += nota + " ";
//		}
//		return s;
//	}
	

	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		
		if(curso.equalsIgnoreCase(other.getCurso())) { // modifiquei o retorno padr�o, verifica somente o nome do curso
			return true;
		}
		
		return false;
	}
	
	
	
	
}
