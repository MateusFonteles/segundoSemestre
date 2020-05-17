package model;

import java.util.Date;

public class Pedido {

	public int numero; 
	public Date data;
	public double impostos; 
	
	public void escreverNumero() {
		System.out.println(numero);
	}
	public void escreverData() {
		System.out.println(data);
	}
	public void escreverImpostos() {
		System.out.println("R$"+impostos);
	}
	
}
