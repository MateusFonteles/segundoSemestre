package aula04;

public class aula04 {

	public static void main(String[] args) {

		Caneta c1 = new Caneta("BIC", 0.5f, "Verde");
 //   	c1.setModelo("BIC");
//		c1.setPonta(0.5f);
	    c1.status();
		
//		System.out.println("Tenho uma caneta  " + 
//		c1.getModelo() + " de ponta " + c1.getPonta());
	
	Caneta c2 = new Caneta("Pentel", 1.0f, "Preta");
	c2.status();
	}

}
