package main;

import model.Util;

public class Main {

	public static void main(String[] args) {

		Util util = new Util();
		
		util.maior(1, 2);
		util.maior(2, 3, 2);
		util.soma(5, 5);
		util.soma(7, 7, 4);
		util.subtracao(10, 5);
		util.subtracao(20, 10, 5);
		util.multiplicacao(5, 5);
		util.multiplicacao(5,  5, 5);
		util.divisao(10, 2);
		util.divisao(15, 3, 5);
		util.concatenacao ("Mateus", "Fonteles");
		util.hello();
		
		
	}

}
