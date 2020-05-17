package model;

public class Calculadora {

	
//Atributos
	
	public double valor1, valor2, valor3;	
	
//Construtores
	
	public Calculadora(double valor1) {
		this.valor1 = valor1;
	}
	
	public Calculadora(double valor1, double valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}
	
	public Calculadora(double valor1, double valor2, double valor3) {
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.valor3 = valor3;
	}

//Outros métodos
	
	public double soma2 () {
		System.out.println(valor1+valor2);
		return valor1+valor2;
	}
	
	public double soma3 () {
		System.out.println(valor1+valor2+valor3);
		return valor1+valor2+valor3;
	}
	
	public double subtracao2 () {
		System.out.println(valor1-valor2);
		return valor1-valor2;
	}
	
	public double subtracao3 () {
		System.out.println(valor1-valor2-valor3);
		return valor1-valor2-valor3;
	}
	
	public double multiplicacao2 () {
		System.out.println(valor1*valor2);
		return valor1*valor2;
	}
	
	public double multiplicacao3 () {
		System.out.println(valor1*valor2*valor3);
		return valor1*valor2*valor3;
	}
	
	public double divisao2 () {
		System.out.println(valor1/valor2);
		return valor1/valor2;}
		
	public double divisao3 () {
		System.out.println(valor1/valor2/valor3);
		return valor1/valor2/valor3;
	}
	
	
	
}
