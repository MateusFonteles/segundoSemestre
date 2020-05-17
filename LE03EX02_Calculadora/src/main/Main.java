package main;

import model.Calculadora;

public class Main {

	public static void main(String[] args) {

		Calculadora calculadora2valores = new Calculadora(10,5);
		
		calculadora2valores.soma2();
		calculadora2valores.subtracao2();
		calculadora2valores.multiplicacao2();
		calculadora2valores.divisao2();
		
		Calculadora calculadora3valores = new Calculadora(20, 10, 2);
		
		calculadora3valores.soma2();
		calculadora3valores.soma3();
		calculadora3valores.subtracao2();
		calculadora3valores.subtracao3();
		calculadora3valores.multiplicacao2();
		calculadora3valores.multiplicacao3();
		calculadora3valores.divisao2();
		calculadora3valores.divisao3();
		
	}

}
