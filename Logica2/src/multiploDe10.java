import java.io.PrintStream;

/*
Faça um algoritmo que conte de 1 a 100 
e a cada múltiplo de 10 emita uma mensagem: 
“Multiplo de 10”.
 */

public class multiploDe10 {

	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			if (i%10==0) {
			saida.println("/multiplo de 10 - " + i);	
			}
		}
		
			}
		}
		

/* 
 		TENTATIVA SEM SUCESSO:
 		
// DECLARAÇÃO DE VARIÁVEIS
	
	int multiplos[] = new int[100];
	int n = 0;
	
// PROCESSAMENTO
	
	for(int i = 1; i <= 100; i++) {
		if (i%10 == 0){
			multiplos[n] = i;
			n++;
		}
	}
//SAÍDA
			
	saida.println(multiplos[n++]);		
*/


