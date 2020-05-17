import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Scanner;

/*
Faça um programa para calcular a média das notas 
dos alunos de uma turma. Inicialmente, o programa 
deve ler um inteiro que representa a quantidade de 
notas a serem lidas. Assuma que esse inteiro é sempre 
maior do que zero. Em seguida, o programa deve ler cada 
nota também como números inteiros. Por fim, o programa 
deve apresentar a média das notas e cada nota utilizada 
no cálculo, de forma ordenada. Tanto a média como as 
notas devem ser apresentadas em formato decimal, com 
vírgula e uma casa decimal, conforme exemplos abaixo. 
Lembre-se de que o primeiro inteiro da entrada é sempre 
a quantidade de notas (n) e os demais inteiros representam 
as n notas dos alunos.
 */

public class mediaDeNotas {

	private static Scanner entrada = new Scanner (System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {

		//DECLARAÇÃO DE VARIÁVEIS
		
		int quantidadeNotas = entrada.nextInt();
		int notas[] = new int [quantidadeNotas];
		double soma = 0;
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
		formatador.setMinimumFractionDigits(1);
		formatador.setMaximumFractionDigits(1);
		
		
		for (int i = 0; i <= quantidadeNotas; i++) {
			notas[i] = entrada.nextInt();
			soma = soma + notas[i];
		}
			double media = soma / quantidadeNotas;
			
			System.out.println ("media = " + formatador.format(media));
			
	}

}
