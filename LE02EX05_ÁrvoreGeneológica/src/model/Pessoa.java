package model;

public class Pessoa {
	

//ATRIBUTOS
	
	int idade;
	String nome;
	public Pessoa pai;
	String sexo; 
	
//GETTERS E SETTERS
	
	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Pessoa getPai() {
		return pai;
	}



	public void setPai(Pessoa pai) {
		this.pai = pai;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

//OUTROS MÉTODOS

		public void mostrarPessoa() {
		System.out.println("Idade: " + idade);
		System.out.println("Nome: " + nome);
		System.out.println("Sexo: " + sexo);
				
		
	}

}
