package com.layane.cursojava.aula43.labs.ex2;

public class PessoaJuridica extends Contribuinte{
	private String cnpj;
	
	 public String getCnpj() {
		return cnpj;
	}
	 
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	@Override
	public double calcularImposto() {
		return this.getRendaBruta() * 0.1;
	}


	@Override
	public String toString() {
		String s = "Pessoa Jurídica [";
				
		s += super.toString(); //pega os dados da classe contribuinte
		
		s += "; CNPJ: " + cnpj;
		s += " ; Imposto a ser pago: " + calcularImposto() + "]";

		return s;
	}
	
	
}
