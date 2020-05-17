package model;

import java.util.Date;

public class Bolo {
	
	public String nome;
	public double peso;
	public String recheio;
	public Date vencimento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getRecheio() {
		return recheio;
	}
	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
	public Date getVencimento() {
		return vencimento;
	}
	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}
	
	

}

/*Escolha o tipo de dado ou classe mais adequada para representar: 
•	O nome de um bolo
•	O peso de um bolo
•	O recheio de um bolo
•	A data de vencimento do bolo
*/