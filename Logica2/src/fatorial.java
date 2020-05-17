import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

/*
Faça um algoritmo para calcular o fatorial de um número 
inteiro qualquer entre 0 e 25 (inclusive).
*/

public class fatorial {
	
	private static PrintStream saida = System.out; 
	public static Scanner entrada = new Scanner (System.in);

	public static void main(String[] args) {
		
// DECLARAÇÃO DE VARIÁVEIS
		
		int numero = entrada.nextInt();
		BigInteger resultado = BigInteger.valueOf (1);

// PROCESSAMENTO
		
		for (int i = numero; i >= 1; i-- ) {
			
			resultado = resultado.multiply(BigInteger.valueOf(i));
			
		}
		
//SAÍDA		
		
		saida.println (resultado);
		
			}

}
