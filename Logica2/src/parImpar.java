import java.io.PrintStream;
import java.util.Scanner;

/*
Faça um programa que leia um número inteiro
e mostre uma mensagem indicando se este número
é par ou ímpar, e se é positivo ou negativo.
*/
 
public class parImpar {
	
	private static Scanner entrada = new Scanner (System.in);
	private static PrintStream saida = System.out;
	

	public static void main(String[] args) {
		
		// DECLARAÇÃO DE VARIÁVEIS / PROCESSAMENTO
		
		int numero = entrada.nextInt();
		String parImpar = (numero % 2 == 0) ? "PAR" : "IMPAR";
		String positivoNegativo = (numero >= 0) ? "POSITIVO" : "NEGATIVO";
		
		// SAÍDA
		
		saida.println (parImpar + " E " + positivoNegativo);		


	}

}
