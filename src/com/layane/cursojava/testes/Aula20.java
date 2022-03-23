package com.layane.cursojava.testes;

import java.util.Scanner;

public class Aula20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[][] jogoVelha = new char[3][3];
		char sinal = 'O';
		int jogada = 1, l = 0, c = 0, jogador = 2;
		boolean ganhou = false;
		
		System.out.println("Jogador 1 = 'X'");
		System.out.println("Jogador 2 = 'O'");
		
		while(!ganhou) {
			if(jogada % 2 != 0) {
				sinal = 'X';
				jogador = 1;
			}
			
			System.out.println("Jogador " + jogador + " digite a posição da linha e coluna com um espaço" );
			l = scan.nextInt();
			c = scan.nextInt();
			
			adicionar(sinal, c, l, jogoVelha, scan);
			
			imprimirTabela(jogoVelha);
			verificarGanhador(jogoVelha, ganhou, sinal, jogador);
			jogada++;
			jogador = 2;
			sinal = '0';
			
			
		}
		
		
		
	}
	
	public static void adicionar(char sinal, int c, int l, char jogoVelha[][], Scanner scan) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(jogoVelha[i][j] == 0) {
					jogoVelha[l - 1][c - 1] = sinal;
				} else {
					System.out.println("Digite novamente a posição da linha e coluna com um espaço" );
					l = scan.nextInt();
					c = scan.nextInt();
					if(jogoVelha[i][j] == 0) {
						jogoVelha[l - 1][c - 1] = sinal;
					}
				}
				
			}
		}
	}
	public static void imprimirTabela(char jogoVelha[][]) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(jogoVelha[i][j] + "|");
			}
			System.out.println();
		}
	}

	public static void verificarGanhador(char jogoVelha[][], boolean ganhou, char sinal, int jogador) {
		if((jogoVelha[0][0] == sinal && jogoVelha[0][1] == sinal && jogoVelha[0][2] == sinal) || //linha 1
				(jogoVelha[1][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[1][2] == sinal) || //linha 2
				(jogoVelha[2][0] == sinal && jogoVelha[2][1] == sinal && jogoVelha[2][2] == sinal) || //linha 3
				(jogoVelha[0][0] == sinal && jogoVelha[1][0] == sinal && jogoVelha[2][0] == sinal) || //coluna 1
				(jogoVelha[0][1] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][1] == sinal) || //coluna 2
				(jogoVelha[0][2] == sinal && jogoVelha[1][2] == sinal && jogoVelha[2][2] == sinal) || //coluna 3
				(jogoVelha[0][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][2] == sinal) || //diagonal 1
				(jogoVelha[0][2] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][0] == sinal)) { //diagonal 2
			System.out.println("Parabéns, jogador " + jogador + " ganhou!");
			ganhou = true;
		}
	}
}
