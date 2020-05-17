package main;

import model.Conta;

public class Main {

	
	public static void main(String[] args) {
		
		Conta conta = new Conta(9000);

//		Conta conta = new Conta();
		
//		conta.setAgencia(123);
		conta.setNumero(123456789);
		conta.setTitular("Mateus");
		conta.setSaldo(500.50);
		
		conta.getAgencia();
		conta.getNumero();
		conta.getTitular();
		conta.getSaldo();
		
		conta.depositar(500);
		conta.consultar();
		conta.sacar(400);
		conta.consultar();
		
		
	}

}
