package com.layane.cursojava.aula74.labs;

public class SimuladorSemaforo {
	public static void main(String[] args) {

		ThreadSemaforo semaforo = new ThreadSemaforo();//quando instancia roda o método run

		for(int i = 0; i < 10; i++) {
			System.out.println(semaforo.getCor());
			semaforo.esperaCorMudar();
		}
		semaforo.desligarSemaforo();
	}
}
