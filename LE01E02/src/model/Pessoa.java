package model;

public class Pessoa {

	public double altura;
	public double peso;
	public double temperaturaCorporal;
	public String sexo;
	public int alturaMilimetros;
	
	public void escreverAltura() {
		System.out.println(altura);
	}
	public void escreverPeso() {
		System.out.println(peso);
	}
	public void escreverTemperatura() {
		System.out.println(temperaturaCorporal);
	}
	public void escreverSexo() {
		System.out.println(sexo);
	}
	public void escreverAlturaMilimetros() {
		System.out.println(altura*1000);
	}
	
}