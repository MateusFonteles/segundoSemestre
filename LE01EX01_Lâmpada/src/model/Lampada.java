package model;

public class Lampada {

//ATRIBUTOS
	public String marca;
	public double preco; 
	public String cor;
	public int voltagem;

//MÉTODOS 
	public void mostrarLampada() {
		System.out.println("Marca: " + marca);
		System.out.println("Cor: " + cor);
		System.out.println("Voltagem: " + voltagem);
		System.out.println("Preço: R$" + preco);		
	}
			
	
	
}
