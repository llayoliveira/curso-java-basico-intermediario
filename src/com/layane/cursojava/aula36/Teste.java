package com.layane.cursojava.aula36;

public class Teste {
	public static void main(String[] args) {
		Contato contato = new Contato();
		
		contato.setNome("Layane");
		//contato.setEndereco("Promissão");
		//contato.setTelefone("14 981053245");
		
		//Relacionamento tem-um Endereco
		Endereco end = new Endereco();
		end.setNomeRua("Silvano Faria");
		end.setNumero("n/a");
		end.setCidade("Promissão");
		end.setCep("16370-000");
		end.setComplemento("Casa");
		end.setEstado("SP");
			
		contato.setEndereco(end);
		
		
		//Relacionamento tem-um Telefone
		Telefone tel = new Telefone();
		tel.setDdd("14");
		tel.setNumero("3541-5274");
		tel.setTipo("Fixo");	
		
		Telefone tel2 = new Telefone();
		tel2.setDdd("14");
		tel2.setNumero("98105-3245");
		tel2.setTipo("Celular");	
		
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = tel;
		telefones[1] = tel2;
		
		//contato.setTelefone(tel);
		contato.setTelefones(telefones);
		
		
		//Teste saída no console
		System.out.println(contato.getNome());
		
		if(contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
	
		//if(contato != null && contato.getTelefone() != null) {
		//	System.out.println(contato.getTelefone().getNumero());
		//}
		
		if(contato != null && contato.getTelefones() != null) {
			for(Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}
		
	}
}
