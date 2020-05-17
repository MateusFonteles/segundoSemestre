
import java.io.PrintStream;

public class teste {
    
	private static PrintStream saida = System.out;
	
    public static void main(String[] args) {
        
    	//Declaração de variáveis
    	
        String[] cartasD = {"Foso", "Capilla", "Sótano", "Aldea", "Leñadores",
"Canciller", "Taller", "Burócrata", "Ladrón", "Banquete", "Prestamista",
"Milicia", "Herrería", "Espía", "Salón del trono", "Remodelar",
"Biblioteca", "Bruja", "Festival", "Laboratorio", "Mercado", "Mina",
"Sala del consejo", "Aventurero", "Jardines"};
        
    //    int j = 0;
    //    while (j<26) {
    //    	System.out.println(cartasD[j++]);   
    //    }   
    
    //Processamento 
    
for (int i = 0 ; i <=10; i++){   
int selecao = (int)(Math.random()*25); 

}

System.out.println(cartasD[selecao]);
  
           
    }
}

//Processamento 

// (int i = 0 ; i <=25; i++);   
//int selecao = (int)(Math.random()*25);  
// cartasD[i] = i;
