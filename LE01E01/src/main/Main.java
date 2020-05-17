package main;

import model.Endereco;
import model.Estado;
import model.Pais;
import model.Planeta;

public class Main {

	public static void main(String[] args) {

		Pais pais = new Pais();
		
		pais.nome = "Brasil";
		pais.area = 8511000;		
		pais.apresentarNome();
		pais.apresentarArea();
		
		Endereco endereco = new Endereco();
		
		endereco.rua = "Rua W3";
		endereco.CEP = 7000000;
		endereco.apresentarRua();
		endereco.apresentarCep();
		
		Estado estado = new Estado();
		
		estado.nome = "DF";
		estado.numeroDeMunicipios = 5;
		estado.apresentarNome();
		estado.apresentarNumeroDeMunicipios();
		estado.apresentarPopulacao();
		
		Planeta planeta = new Planeta();
		
		planeta.nome = "Terra";
		planeta.populacao = 15;
		planeta.apresentarNome();
		planeta.apresentarPopulacao();
	}

}
