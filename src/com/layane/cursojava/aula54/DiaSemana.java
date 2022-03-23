package com.layane.cursojava.aula54;

public enum DiaSemana {
	SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);
	//quando declara o segunda e j� passa o valor entre par�nteses j� est� chamando o construtor, ai n�o precisa usar o new
	
	private int valor;
	
	DiaSemana(int valor){
		this.valor = valor;
	}
	
	public int getValor(){
		return this.valor;
	}
}
