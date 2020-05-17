package Main;

import java.util.Calendar;

import model.Cliente;
import model.Endereco;

public class Main {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(2020, 2, 20, 20, 05);
		
		Cliente cliente = new Cliente();
		cliente.nome = "Gustavo";
		cliente.dataNascimento = calendar.getTime();
		
		cliente.endereco = new Endereco();
		cliente.endereco.logradouro = "SQN 610";
		cliente.endereco.numero = 106;
		cliente.endereco.complemento = "Asa Norte";
		cliente.endereco.cidade = "Brasília";
		cliente.endereco.CEP = "700000000"; 
		
		cliente.endereco.escreverEndereco();
	
	}

}
