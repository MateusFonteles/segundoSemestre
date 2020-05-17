package main;

import model.Util;

public class Main {
	
	public static void main (String[] args) {
		
		Util util = new Util();
		
		int c = util.maior(3,4);
		
		System.out.println(c);
		
		int d = util.maior(4, 5, 6);
		
		System.out.println(d);
		
		int e = util.soma(5, 5);
		System.out.println(e);

		int f = util.soma(5, 5, 5);
		System.out.println(f);
		
		int g = util.subtracao(4, 6);
		System.out.println(g);

		int h = util.subtracao(10, 5, 2);
		System.out.println(h);
		
		int i = util.multiplicacao(5, 5);
		System.out.println(i);
		
		int j = util.multiplicacao(5, 5, 4);
		System.out.println(j);
		
		double k = util.divisao(7, 2);
		System.out.println(k);
		
		double l = util.divisao(15, 3, 2);
		System.out.println(l);
		
		String m = util.concatenar("Mateus", "Fonteles");
		System.out.println(m);
		
		util.hello();
}
}