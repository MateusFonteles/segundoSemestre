package main;

import model.Contato;

public class Main {

	public static void main(String[] args) {

		Contato contato1 = new Contato();
		
		contato1.setNome("Mateus");
		contato1.setTipo("Família");
		contato1.setTelefone("(85)99108-0067");
		contato1.setEmail("mateus.fonteles@estudante.ifb.edu.br");
		contato1.setEndereco("SQN 409 Bloco J apt 305");
		
		contato1.mostrarContato();
		

	}

}
