
public class alfa {

	private static PrintStream saida = System.out;
	
	public static void main (String[]args) {
		
		int []contagem = new int[100];
		
		for(int i = 0; i <100 ; i++) {
			contagem[i] = i+1;
		if(contagem[i]%10 == 0) {
			System.out.println("Multiplo de 10 "+contagem[i]);
		}
		}
	}
	
}
