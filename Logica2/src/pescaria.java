import java.io.PrintStream;
import java.util.Scanner; 

/*
João Papo-de-Pescador, homem de bem, 
comprou um microcomputador para controlar 
o rendimento diário de seu trabalho. 
Toda vez que ele traz um peso de peixes maior 
do que o estabelecido pelo regulamento de pesca 
do estado de São Paulo (50 quilos), deve pagar 
uma multa de R$ 4,00 por quilo excedente. 
João precisa que você faça um programa que receba 
como entrada um valor inteiro que representa o peso 
dos peixes pescados, e imprima o excesso de peso e
o valor da multa que João deverá pagar, conforme 
exemplos abaixo. 
 */

public class pescaria {
	
	private static PrintStream saida = System.out;
	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Declaração de variáveis
	//  Processamento

		int peso = entrada.nextInt ();
		int excedente = peso - 50;
		int multa = excedente * 4;
		
	//	Saída
		
		if (excedente <= 0) {
			saida.println ("excedente = 0");
			saida.println ("multa = 0");
			
		} else {
				saida.println ("excedente = " + excedente);
				saida.println ("multa = " + multa);
				
			}
		}
	}


