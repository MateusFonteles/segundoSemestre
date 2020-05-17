package model;

public class Endereco {

	public String logradouro;
	public int numero;
	public String complemento;
	public String cidade;
	public String CEP;

	public void escreverEndereco() {
		System.out.println(logradouro + ", " +
							numero + ", " +
							complemento + ", " +
							cidade + ", " +
							CEP);
	
		
	}

}
