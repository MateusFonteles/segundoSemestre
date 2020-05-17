import java.io.PrintStream;
import java.util.Scanner;

/*
Elabore um programa que leia o código e o número
de horas trabalhadas por um operário, e calcule
o seu salário, sabendo que ele ganha R$ 10,00
por hora trabalhada. Quando o número de horas
exceder a 50, calcule o montante a receber relativo
a pagamento de horas extras, sabendo que a hora extra
de trabalho vale R$ 20,00. No final do processamento, 
imprima o código do operário, o salário relativo a 
horas extras e o salário total, conforme exemplos a seguir.
 */

public class horasExtras {

	private static Scanner entrada = new Scanner (System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		
		// DECLARAÇÃO DE VARIÁVEIS
		
		int codigo = entrada.nextInt();
		int horas = entrada.nextInt();
		int horasExtras = (horas > 50) ? horas - 50 : 0;
		int salarioExcedente = 0;
		int salarioTotal = 0;
		int salarioBase = (horas > 50) ? 500 : horas * 10; 
		
		//PROCESSAMENTO
		
		salarioExcedente = horasExtras * 20;
		salarioTotal = salarioExcedente + salarioBase;
		
		//SAÍDA
		
			saida.println ("codigo = " + codigo);
			saida.println ("salarioExcedente = " + salarioExcedente);
			saida.println ("salarioTotal = " + salarioTotal);
		
		}
					
	}


