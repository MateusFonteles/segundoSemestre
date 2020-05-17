import java.io.PrintStream;
import java.util.Scanner;

/*
 Desenvolva um programa que leia 4 números 
 e calcule o quadrado de cada um. 
 Se o valor resultante do quadrado do terceiro
 for maior ou igual a 1000, imprima-o e finalize. 
 Caso contrário, imprima os valores lidos e seus
  respectivos quadrados.
 */
public class quadrados {

	private static Scanner entrada = new Scanner (System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		
	// Declaração de variáveis / Processamento
		
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();
		int d = entrada.nextInt();
		int a2 = a * a;
		int b2 = b * b;
		int c2 = c * c;
		int d2 = d * d;

	// Saída
		
		if (c2 >= 1000) {
			saida.println ("c2 = " + c2);
			
		}else {
			saida.println ("a = " + a);
			saida.println ("b = " + b);
			saida.println ("c = " + c);
			saida.println ("d = " + d);
			saida.println ("a2 = " + a2);
			saida.println ("b2 = " + b2);
			saida.println ("c2 = " + c2);
			saida.println ("d2 = " + d2);
		}
		
	}
}
