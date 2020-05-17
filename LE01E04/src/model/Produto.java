package model;

public class Produto {
	
	public String tipo; 
	public double preco;
	public int quantidade; 

	public void escreverTipo() {
		 System.out.println();
	}
	public void escreverPreco() {
		System.out.println("R$"+preco);
	}
	public void escreverQuantidade() {
		System.out.println(quantidade);
	}
	
}
