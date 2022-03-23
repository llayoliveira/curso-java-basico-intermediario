package com.layane.cursojava.aula27;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		JogoVelha jogoVelha = new JogoVelha();
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		boolean ganhou = false;
		int linha = 0, col = 0;
		char sinal;
		
		while(!ganhou) {
			if(jogoVelha.vezJogador1()) { 
				System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3).");
				sinal = 'X';
			} else { 
				System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3).");
				sinal = 'O';
			}
			linha = valor("Linha", scan);
			col = valor("Coluna", scan);
			
			if(!jogoVelha.validarJogada(linha, col, sinal)){
				System.out.println("Posi��o j� usada, tente novamente");
			}
			
			jogoVelha.imprimirTabuleiro();
			
			if(jogoVelha.verificarGanhador('X')) {
				ganhou = true;
				System.out.println("Parab�ns, jogador 1 ganhou!");
			} else if(jogoVelha.verificarGanhador('O')) {
					ganhou = true;
					System.out.println("Parab�ns, jogador 2 ganhou!");
			} else if (jogoVelha.jogada > 9){
				ganhou = true;
				System.out.println("Ningu�m ganhou essa partida!");
			}
		}
	}
	
	static int valor(String tipo, Scanner scan) {
		int valor = 0;
		boolean valorValido = false;
		while(!valorValido) {
			System.out.println("Digite a " + tipo + " (1, 2 ou 3)");
			valor = scan.nextInt();
			if(valor >=1 && valor <= 3) {
				valorValido = true;
			} else {
				System.out.println("Entrada inv�lida, tente novamente");
			}
		}
		valor--;
		return valor;
	}
}
