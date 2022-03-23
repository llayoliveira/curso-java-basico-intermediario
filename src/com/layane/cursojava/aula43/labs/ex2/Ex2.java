package com.layane.cursojava.aula43.labs.ex2;

public class Ex2 {

	public static void main(String[] args) {
		PessoaJuridica c1 = new PessoaJuridica();
		PessoaJuridica c2 = new PessoaJuridica();
		PessoaJuridica c3 = new PessoaJuridica();
		
		PessoaFisica c4 = new PessoaFisica();
		PessoaFisica c5 = new PessoaFisica();
		PessoaFisica c6 = new PessoaFisica();
		
		c1.setNome("Conta 1");
		c2.setNome("Conta 2");
		c3.setNome("Conta 3");
		c4.setNome("Conta 4");
		c5.setNome("Conta 5");
		c6.setNome("Conta 6");
		
		c1.setCnpj("47.246.159/0001-54");
		c2.setCnpj("10.718.029/0001-67");
		c3.setCnpj("89.071.884/0001-89");
		c4.setCpf("070.898.700-14");
		c5.setCpf("977.700.530-05");
		c6.setCpf("862.556.160-88");
		
		c1.setRendaBruta(1000);
		c2.setRendaBruta(5000);
		c3.setRendaBruta(8000);
		c4.setRendaBruta(1400);
		c5.setRendaBruta(2200);
		c6.setRendaBruta(4000);


		Contribuinte[] contribuintes = new Contribuinte[6];
		contribuintes[0] = c1;
		contribuintes[1] = c2;
		contribuintes[2] = c3;
		contribuintes[3] = c4;
		contribuintes[4] = c5;
		contribuintes[5] = c6;
		
		
		for(Contribuinte c : contribuintes) {
			System.out.println(c);
		}

	}

}
