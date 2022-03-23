package com.layane.cursojava.aula20;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean ganhou = false;
		char[][] jogoVelha = new char[3][3];
		int linha = 0, col = 0;
		
		int jogada = 1;
		char sinal;
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		while(!ganhou) {
			if(jogada % 2 == 1) { //jogador 1
				System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3).");
				sinal = 'X';
			} else { //jogador 2
				System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3).");
				sinal = 'O';
			}
			
			boolean linhaValida = false;
			while(!linhaValida) {
				System.out.println("Digite a linha (1, 2 ou 3)");
				linha = scan.nextInt();
				if(linha >=1 && linha <= 3) {
					linhaValida = true;
				} else {
					System.out.println("Entrada inválida, tente novamente");
				}
			}
			
			boolean colunaValida = false;
			while(!colunaValida) {
				System.out.println("Digite a coluna (1, 2 ou 3)");
				col = scan.nextInt();
				if(col >=1 && col <= 3) {
					colunaValida = true;
				} else {
					System.out.println("Entrada inválida, tente novamente");
				}
			}
			
			linha--;
			col--;
			if(jogoVelha[linha][col] == 'X' || jogoVelha[linha][col] == 'O') {
				System.out.println("Posição já usada, tente novamente");
			} else {
				jogoVelha[linha][col] = sinal;
				jogada++;
			}
			
			//imprimir tabuleiro
			for(int i = 0; i < jogoVelha.length; i++) {
				for(int j = 0; j < jogoVelha[i].length; j++) {
					System.out.print(jogoVelha[i][j] + " | ");
				}
				System.out.println();
			}
			
			//verificar se tem ganhador
			if((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X') || //linha 1
					(jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X') || //linha 2
					(jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X') || //linha 3
					(jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X') || //coluna 1
					(jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X') || //coluna 2
					(jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X') || //coluna 3
					(jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X') || //diagonal 1
					(jogoVelha[0][2] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][0] == 'X')) { //diagonal 2
				ganhou = true;
				System.out.println("Parabéns, jogador 1 ganhou!");
			} else if ((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O') || //linha 1
					(jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O') || //linha 2
					(jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O') || //linha 3
					(jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O') || //coluna 1
					(jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O') || //coluna 2
					(jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O') || //coluna 3
					(jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O') || //diagonal 1
					(jogoVelha[0][2] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][0] == 'O')) { //diagonal 2
				ganhou = true;
				System.out.println("Parabéns, jogador 2 ganhou!");
			} else if (jogada > 9) {
				ganhou = true;
				System.out.println("Ninguém ganhou essa partida!");
			}		
		}
	}
}
