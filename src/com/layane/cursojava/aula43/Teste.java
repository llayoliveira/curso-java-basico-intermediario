package com.layane.cursojava.aula43;

public class Teste {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		aluno.setCurso("Ciência da Computação");
		double[] notas = {10, 9, 8, 7}; //pode inicializar assim
		aluno.setNotas(notas);
		
		System.out.println(aluno.toString());
		
		String s1 = "jskdjskdjks";
		String s2 = "jskdjskdjks";
		
		//System.out.println(s1 == s2); // errado pois compara a referência do objeto
		
		System.out.println(s1.equals(s2));
	
		
		Aluno aluno2 = new Aluno();

		aluno2.setCurso("Ciência da Computação");
		double[] notas2 = {10, 9, 8, 7}; 
		aluno2.setNotas(notas2);
		
		System.out.println(aluno == aluno2); // compara referência
		
		System.out.println(aluno.equals(aluno2)); //continua dando false, pq o equals padrão também compara os atributos. Para dar true deve modificar o método equals
		
	}

}
