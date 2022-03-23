package com.layane.cursojava.aula58;

public class TesteAutoboxing {

	public static void main(String[] args) {
		//autoboxing -> transformar em objeto
		Short num7 = 1;
		Byte num8 = 10;
		Integer num9 = 100;
		Long num10 = 100l; //new Long(10000l) (por trás dos panos)
		Float num11 = 3.5f;//new Float(3.5f)
		Double num12 = 3.55555;
		Boolean flag2 = true;
		Character b_ ='b';

		//auto un-boxing -> Objeto em primitivo
		int num13 = num9; // é igual a num9.intValue();
		
		//autoboxing em expressões
		num9++; 
		System.out.println(num9);
		
		//auto un-boxing do num9 -> realiza a expressão -> faz o autoboxing(num/13/num9) -> num14
		Integer num14 = num13/num9;
		
		//mau uso
		Double a, b, c; //se for para trabalhar muito com os números, é melhor realizar com os números primitivos, dps se precisar fazer o autoboxing. 
		a = 10.0;
		b = 12.2;
		c = 4.7;
		
		Double media = (a+b+c) / 8;
		
		System.out.println(media);
		
	}

}
