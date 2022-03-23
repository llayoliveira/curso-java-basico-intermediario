package com.layane.cursojava.aula15;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra");
		
		char letra = scan.next().charAt(0);
		
		switch(letra) { //ficaria melhor fazer as vogais num if(com ||) e usar o else para as consoantes. Ou as consoantes no default
		case 'A':
		case 'a':
		case 'E': 
		case 'e':
		case 'I':
		case 'i':
		case 'O':
		case 'o':
		case 'U':
		case 'u': System.out.println("Vogal"); break;
		case 'B': 
		case 'b':
		case 'C':
		case 'c':
		case 'D':
		case 'd':
		case 'F':
		case 'f':
		case 'G':
		case 'g':
		case 'H':
		case 'h':
		case 'J':
		case 'j':
		case 'K':
		case 'k':
		case 'L':
		case 'l':
		case 'M':
		case 'm':
		case 'N':
		case 'n':
		case 'P':
		case 'p':
		case 'Q':
		case 'q':
		case 'R':
		case 'r':
		case 'S':
		case 's': 
		case 'T':
		case 't':
		case 'V':
		case 'v':
		case 'W':
		case 'w':
		case 'X':
		case 'x':
		case 'Y':
		case 'y':
		case 'Z':
		case 'z': System.out.println("Consoante"); break;
		default: System.out.println("Letra inválida");
		}
	}

}
