package com.layane.cursojava.aula63;

public class ExemploPrintf {

	public static void main(String[] args) {
		System.out.printf("%s", "Ol�, Mundo!");//string
		System.out.println();
		System.out.printf("%S", "Ol�, Mundo!");//string com todas as letras mai�sculas
		System.out.println();
		
		System.out.printf("%c", 'C');//charactere
		System.out.println();
		System.out.printf("%C", 'C');//charactere mai�sculo
		
		System.out.printf("%n");
		
		int valor = 123456789;
		System.out.printf("%d", valor);//inteiro
		System.out.println();
		
		double pontoFlutuante = 3.1456789;
		System.out.printf("%f", pontoFlutuante);//double
		System.out.println();
		
		String olaMundo = "Ol�, Mundo!";
		System.out.printf("%20s", olaMundo);//tem 20 characteres, fica alinhado na direita por padr�o
		 
		System.out.println();
		
		System.out.printf("%-20s", olaMundo);//alinha � esquerda
		
		System.out.println();
		
		System.out.printf("%+d", valor);//o + mostra o sinal(positivo/negativo)
		
		System.out.println();
		
		System.out.printf("%15d", valor);//15 d�gitos
		
		System.out.println();
		
		System.out.printf("%015d", valor);//completa os espa�os com 0
		
		System.out.println();
		
		System.out.printf("%,d", valor);//separar as milhas
		
		System.out.println();
		
		int valor2 = -123456789;
		
		System.out.printf("% d", valor2);//imprime sinal negativo
		System.out.println();
		System.out.printf("% d", valor); //da um espa�o e n�o imprime o sinal quando o n�mero � positivo
		System.out.println();
		
		System.out.printf("%.3f", pontoFlutuante);//imprime 3 casas decimais e arredonda
		System.out.println();
		
		System.out.printf("R$%10.2f", pontoFlutuante);//10 d�gitos e 2 casas decimais
		System.out.println();
		
		testeMaisCompleto();
	}
	
	private static void testeMaisCompleto() {
		
		double[] precos = {1000, 123, 54, 7843.567, 1, 4.56789};
		
		for(int i = 0; i < precos.length; i++) {
			System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i]);
		}
	}

}
