package com.layane.cursojava.aula46.labs;

public class Teste {

	public static void main(String[] args) {
		Quadrado quadrado = new Quadrado();
		quadrado.setNome("Quadrado");
		quadrado.setLado(2);
		
		Triangulo triangulo = new Triangulo();
		triangulo.setNome("Triangulo");
		triangulo.setAltura(2);
		triangulo.setBase(3);
		
		Circulo circulo = new Circulo();
		circulo.setNome("Círculo");
		circulo.setRaio(2);
		
		Piramide piramide = new Piramide();
		piramide.setNome("Pirâmide");
		piramide.setAltura(3);
		piramide.setApotema(4);
		piramide.setArestaBase(2);
		piramide.setNumPoliBase(4);
		piramide.setBase(quadrado);
		
		Cilindro cilindro = new Cilindro();
		cilindro.setNome("Cilindro");
		cilindro.setAltura(3);
		cilindro.setRaio(2);
		
		Cubo cubo = new Cubo();
		cubo.setNome("Cubo");		
		cubo.setLado(3);
		
		FiguraGeometrica[] figuras = new FiguraGeometrica[6];
		
		figuras[0] = quadrado;
		figuras[1] = triangulo;
		figuras[2] = circulo;
		figuras[3] = piramide;
		figuras[4] = cilindro;
		figuras[5] = cubo;
		
		for(FiguraGeometrica fg : figuras) {
			System.out.println(fg.getNome());
			
			if(fg instanceof Figura2D) {
				Figura2D f2d = (Figura2D) fg; //downcasting
				System.out.println("Área: " + f2d.calcularArea());
			}
			
			if(fg instanceof Figura3D) {
				Figura3D f3d = (Figura3D) fg; //downcasting
				System.out.println("Área: " + f3d.calcularArea());
				System.out.println("Volume: " + f3d.calcularVolume());
			}
			System.out.println("-------------------");
		}
		
	}

}
