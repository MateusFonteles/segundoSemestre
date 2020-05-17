package main;

import model.Pessoa;

public class Main {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		
		pessoa.altura = 1.82;
		pessoa.peso = 100;
		pessoa.sexo = "Masculino";
		pessoa.temperaturaCorporal = 40;
		
		pessoa.escreverAltura();
		pessoa.escreverPeso();
		pessoa.escreverSexo();
		pessoa.escreverTemperatura();
		pessoa.escreverAlturaMilimetros();
		
	}

}
