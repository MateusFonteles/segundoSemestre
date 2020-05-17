package model;

public class Usuario {

//ATRIBUTOS
	public String nome;
	public long cadastro;

//GETTERS E SETTERS	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCadastro() {
		return cadastro;
	}

	public void setCadastro(long cadastro) {
		this.cadastro = cadastro;
	}

//OUTROS MÉTODOS
	public void mostrarUsuario() {
		System.out.println("Usuário: " + getNome());
		System.out.println("Cadastro: " + getCadastro());
	}

}
