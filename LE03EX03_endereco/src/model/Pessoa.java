package model;

public class Pessoa {

//ATRIBUTOS
	String nome; 
	long cpf;
	Endereco endereco; 
	
//CONSTRUCTORS
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, long cpf) {
		this.nome = "Mateus";
		this.cpf = 72104;
	}
	
//OUTROS MÉTODOS
	public void mostrarPessoa() {
		System.out.println(nome);
		System.out.println(cpf);
		
	}
}

/*Crie as classes Pessoa e Endereco e faça o que se pede:
1. Na classe Endereco, insira os atributos logradouro, numero, complemento, bairro, cidade e CEP. 
Crie um construtor vazio e outro para inicializar todos os atributos da classe.
2. Na classe Pessoa, insira os atributos nome, CPF, e endereço (associação da classe Endereco). 
Crie um construtor vazio e outro para inicializar todos os atributos da classe.
3. Crie um método, em cada classe do exemplo, para retornar uma String que apresente o conteúdo 
de todos os atributos;
4. Implemente o método main para apresentar o contexto referente aos itens acima.*/