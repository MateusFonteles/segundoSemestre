package main;

import model.Lampada;

public class Main {

	public static void main(String[] args) {

		Lampada lampada1 = new Lampada();
		lampada1.cor = "Amarela";
		lampada1.marca = "Lux";
		lampada1.voltagem = 220;
		lampada1.preco= 10.50;
		
		lampada1.mostrarLampada();
	}

}
