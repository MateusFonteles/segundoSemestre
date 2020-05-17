package main;

import model.Endereco;
import model.Pessoa;

public class Main {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa("Mateus", 722888);
		Endereco endereco = new Endereco("SQN 409, bloco J", 305, 305, "Asa Norte", "Brasília", 700000000);
		
		pessoa.mostrarPessoa();
		endereco.mostrarEndereco();
	}

}
