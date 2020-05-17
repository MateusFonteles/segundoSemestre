package model;

public class Endereco {
	
	
//ATRIBUTOS	
	String logradouro;
	int numero;
	int complemento;
	String bairro;
	String cidade;
	long cep;
	
//CONSTRUCTORS
	
	public Endereco() {
		
	}
		public Endereco(String logradouro, int numero, int complemento, String bairro, String cidade, long cep) {
		this.logradouro = "SQN 409, bloco J";
		this.numero = 305;
		this.complemento = 305;
		this.bairro = "Asa Norte";
		this.cidade = "Brasília";
		this.cep = 700000000;
		}
//OUTROS MÉTODOS
		
			public void mostrarEndereco(){
			System.out.println(this.logradouro);
			System.out.println(numero);
			System.out.println(complemento);
			System.out.println(bairro);
			System.out.println(cidade);
			System.out.println(cep);
			}
		}
	
	




/*Crie as classes Pessoa e Endereco e faça o que se pede:
1. Na classe Endereco, insira os atributos logradouro, numero, complemento, bairro, cidade e CEP. 
Crie um construtor vazio e outro para inicializar todos os atributos da classe.
2. Na classe Pessoa, insira os atributos nome, CPF, e endereço (associação da classe Endereco). Crie um construtor vazio e outro para inicializar todos os atributos da classe.
3. Crie um método, em cada classe do exemplo, para retornar uma String que apresente o conteúdo de todos os atributos;
4. Implemente o método main para apresentar o contexto referente aos itens acima.*/