package model;

public class CadernoDeEnderecos {

//ATRIBUTOS	
	public String nome;
	public String tipo;
	public String telefone;
	public String email;
	public String endereco;
	
//GETTERS E SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
//OUTROS MÉTODOS
	public void mostrarContato() {
		System.out.println("Nome: " + nome);
		System.out.println("Tipo: " + tipo);
		System.out.println("Telefone: " + telefone);
		System.out.println("E-mail: " + email);
		System.out.println("Endereço: " + endereco);
	}
	
}
