package model;

public class Pagamento {

	public String tipo;
	public double valor;
	
	public void escreverTipo() {
		System.out.println(tipo);
	}
	public void escreverValor() {
	System.out.println("R$"+valor);	
	}
}
