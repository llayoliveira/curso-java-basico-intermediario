package com.layane.cursojava.aula68;

public class MinhaThreadRunnable implements Runnable{

	private String nome;
	private int tempo;
	
	
	MinhaThreadRunnable(String nome, int tempo) {
		super();
		this.nome = nome;
		this.tempo = tempo;
		Thread t = new Thread(this); //this para passar a classe como parâmetro
		t.start();
	}


	@Override
	public void run() {
		try {
			for(int i = 0; i <6; i++) {
				System.out.println(nome + " contador " + i);
				Thread.sleep(tempo);
			}
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(nome + "terminou a execução");
	}

}
