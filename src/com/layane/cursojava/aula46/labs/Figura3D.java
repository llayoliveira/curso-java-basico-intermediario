package com.layane.cursojava.aula46.labs;

public abstract class Figura3D extends FiguraGeometrica implements DimensaoSuperficial, DimensaoVolumetrica{
	
	public abstract double calcularArea();
	public abstract double calcularVolume();
}
