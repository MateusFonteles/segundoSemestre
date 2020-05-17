package main;

import model.Pessoa;

public class Main {

	public static void main(String[] args) {

//Pessoa	
		Pessoa pessoa = new Pessoa();
		pessoa.setIdade(36);
		pessoa.setNome("Mateus");
		pessoa.setSexo("Masculino");
	 
		pessoa.mostrarPessoa();
		
		
//Pai		
		pessoa.pai = new Pessoa();
		
		pessoa.pai.setIdade(71);
		pessoa.pai.setNome("Renato");
		pessoa.pai.setSexo("Masculino");
		
		pessoa.pai.mostrarPessoa();
		
//Avô
		
		pessoa.pai.pai = new Pessoa();
		pessoa.pai.pai.setIdade(94);
		pessoa.pai.pai.setNome("Maurício");
		pessoa.pai.pai.setSexo("Masculino");
		
		pessoa.pai.pai.mostrarPessoa();
	}

}
