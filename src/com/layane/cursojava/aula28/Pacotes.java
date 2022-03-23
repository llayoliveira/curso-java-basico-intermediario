package com.layane.cursojava.aula28;

import com.layane.cursojava.aula19.Ex11;
import com.layane.cursojava.aula20.Ex1; // se colocar um * no lugar do Ex1, vai ter acesso a todas as classes desse pacote.
import com.layane.cursojava.aula26.Carro;

public class Pacotes {

	public static void main(String[] args) {
		Carro carro; // se digitar só essa linha, vai dar erro, pois não temos essa classe dentro do pacote. Precisamos importar.
		com.layane.cursojava.aula27.Carro carro2;

		Ex1 ex1;
		Ex11 ex11;
	}

}
