package model;

public class Util {

	public int maior(int a, int b) {
		if (a >= b) {
			return a;
		}else {
			return b;
		}
	}
	
	public int maior (int a, int b, int c) {
		if (a>b && a>c) {
			return a;
		}else if (b>a && b>c) {
			return b;
		}else if (c>a && c>b) {
			return c;
		}else {
			return a;
		}
	}
	
	public int soma(int a, int b) {
		return a + b;
	}
	
	public int soma(int a, int b, int c) {
		return a + b + c;
	}
	
	public int subtracao(int a, int b) {
		return a - b;
	}
	
	public int subtracao(int a, int b, int c) {
		return a - b - c;
	}
	
	public int multiplicacao(int a, int b) {
		return a * b;
	}
	
	public int multiplicacao(int a, int b, int c) {
		return a * b * c;
	}
	
	public double divisao (double a, double b) {
		return a/b;
	}
	
	public double divisao (double a, double b, double c) {
		return a/b/c;
	}
	
	public String concatenar (String nome, String sobrenome) {
		return nome + sobrenome;
	}
	
	public void hello() {
		System.out.println("Hello World!");
	}
}
