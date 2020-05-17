package pooAula2;

public class caneta {
		
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga + "%");
		System.out.println("Está tampada? " + this.tampada);

	}
	
	void rabiscar() {
		if (this.tampada == true && this.carga == 0) {
			System.out.println("Erro. Não posso rabiscar tampada e sem carga!");

		}
		else if(this.tampada == true) {
			System.out.println("Erro. Não posso rabiscar tampada!");
		}else if(this.carga == 0){
			System.out.println("Erro. Não posso rabiscar sem carga!");
		}else {
			System.out.println("Estou rabiscando.");
		}
	}
	
	void tampar() {
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada = false;
	}
	 
}
