package model;

import java.util.Date;

public class Pessoa {

	//ATRIBUTOS
	public String nome;
	public Date dataNascimento;
	public Pessoa mae;
	public Pessoa pai;
	
	//M�TODOS
	public void escreverDados() {
		System.out.println(nome + " " + dataNascimento);
	} 
	
}
