package aula04;

public class Caneta {

	
	// DECLARAÇÃO DE ATRIBUTOS
	private String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	
	// MÉTODOS GETTER E SETTER
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	public void setPonta(float p) {
		this.ponta = p;
		
	}
	public String getCor() {
		return this.cor;
	}
	public void setCor(String c) {
		this.cor = c;
	}
	
	// MÉTODO STATUS 
	public void status() {
		System.out.println("Sobre a Caneta:");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Tampada: " + this.tampada);
	}
	
	//MÉTODOS TAMPAR E DESTAMPAR
		public void tampar() {
			this.tampada = true;
		}
		public void destampar() {
			this.tampada = false; 
		}


	
	
	//MÉTODO CONSTRUTOR 1
//	public Caneta() {
//		this.tampar();
//		this.cor = "Azul";
//		this.setModelo("BIC");
//		this.setPonta(1.0f);
//	}
		
		//MÉTODO CONSTRUTOR 2
		public Caneta (String m, float p, String c) {
			this.modelo = m;
			this.ponta = p;
			this.cor = c;
			this.tampar();
		}
		
}
