 package pooAula2;

public class aula2 {
	public static void main (String[] args) {
		
		caneta c1 = new caneta();
		c1.modelo = "BIC";
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampada = false;
		c1.carga = 1;
		c1.status();
		c1.rabiscar();
		
		caneta c2 = new caneta();
		
		c2.modelo = "MontBlanc";
		c2.cor = "Preta";
		c2.ponta = 1.5f;
		c2.tampada = true;
		c2.carga = 100;
		c2.status();
		c2.rabiscar();
		
caneta c3 = new caneta();
		
		c3.modelo = "Rolex";
		c3.cor = "Vermelha";
		c3.ponta = 1.0f;
		c3.tampada = true;
		c3.carga = 50;
		c3.destampar();
		c3.status();
		c3.rabiscar();

	}

}
