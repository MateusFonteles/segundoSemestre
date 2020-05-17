package model;

public class Calculadora {

//ATRIBUTOS
	public double valor1, valor2, valor3;
	
//CONSTRUTORES
	public Calculadora (double valor1, double valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}
	public Calculadora (double valor1, double valor2, double valor3) {
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.valor3 = valor3;
	}
	public double soma(double valor1, double valor2) {
		return valor1 + valor2;
	}
	
	public double soma(double valor1, double valor2, double valor3) {
		return valor1 + valor2 + valor3;
	}
	
	public double subtracao(double valor1, double valor2) {
		return valor1 - valor2;
	}
	
	public double subtracao(double valor1, double valor2, double valor3) {
		return valor1 - valor2 - valor3;
	}
	
	public double multiplicacao(double valor1, double valor2) {
		return valor1 * valor2;
	}
	
	public double multiplicacao(double valor1, double valor2, double valor3) {
		return valor1 * valor2 * valor3;
	}
	
	public double divisao (double valor1, double valor2) {
		return valor1/valor2;
	}
	
	public double divisao (double valor1, double valor2, double valor3) {
		return valor1/valor2/valor3;
	}
}
