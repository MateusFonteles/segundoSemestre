package main;

import java.util.Calendar;

import model.Pessoa;

public class Main {

	public static void main(String[] args) {

		//PESSOA
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "David";
		pessoa.dataNascimento = Calendar.getInstance().getTime();
		
		pessoa.escreverDados();
		
		//PAI
		pessoa.pai = new Pessoa();
		pessoa.pai.nome = "Alfredo";
		pessoa.pai.dataNascimento = Calendar.getInstance().getTime();
		
		pessoa.pai.escreverDados();
		
		//AVÔ
		pessoa.pai.pai = new Pessoa();
		pessoa.pai.pai.nome = "Alberico";
		pessoa.pai.pai.dataNascimento = Calendar.getInstance().getTime();
		
		pessoa.pai.pai.escreverDados();
	}

}
