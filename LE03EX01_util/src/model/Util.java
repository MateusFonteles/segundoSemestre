package model;

public class Util {


	
//Métodos
	//Maior de 2
	
	public int maior (int n1, int n2) {
		if (n1 >= n2) {
			return n1;
		}else{
				return n2;
			}
	}
	
//Maior de 3
		public int maior (int n1, int n2, int n3) {
			if (n1 >= n2 && n1 >= n3) {
				return n1;
			}else if (n2 >= n1 && n2 >= n3) {
				return n2;
			}else {
					return n3;
				}
			}
	
//Soma	
		public int soma (int n1, int n2) {
			return n1 + n2;
		}
		
//Soma de 3
		public int soma (int n1, int n2, int n3) {
			return n1 + n2 + n3;
		}
		
//Subtração
		public int subtracao (int n1, int n2) {
			return n1 - n2;
		}

//Subtração de 3
		public int subtracao (int n1, int n2, int n3) {
			return n1-n2-n3;
		}
		
//Multiplicação
		public int multiplicacao (int n1, int n2) {
			return n1 * n2;
		}
		
//Multiplicação de 3
		public int multiplicacao (int n1, int n2, int n3) {
			return n1*n2*n3;
		}
		
//Divisão
		public int divisao (int n1, int n2) {
			return n1/n2;
		}
		
//Divisão de 3
		public int divisao (int n1, int n2, int n3) {
			return n1/n2/n3;
		}
		
//Concatenar nome
		public String concatenacao (String n1, String n2) {
			return n1+n2;
		}
		
//Hello World
		public void hello() {
			System.out.println("Hello, World!");
		}
}

