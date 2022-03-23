package com.layane.cursojava.aula17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		/*int ano = 1997;
		double aumento = 1.5;
		double salario = 1000;//1995
		salario += (salario/100)*aumento;//1996
		
		DecimalFormat format = new DecimalFormat("###,###.##");
		
		for(int i = ano; i <= 2021; i++) {
			aumento *= 2;
			salario += (salario/100)*aumento;
			System.out.println("Ano: " + i + ". Salário: " + format.format(salario));
		}*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o salário");
		double salario = scan.nextDouble();//1995
		
		int ano = 1997;
		double aumento = 1.5;		
		salario += (salario/100)*aumento;//1996
		
		DecimalFormat format = new DecimalFormat("###,###.##");
		
		for(int i = ano; i <= 2021; i++) {
			aumento *= 2;
			salario += (salario/100)*aumento;
			System.out.println("Ano: " + i + ". Salário: " + format.format(salario));
		}
	}

}
