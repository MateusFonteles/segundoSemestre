package model;

public class Conta {

//ATRIBUTOS	
	public long agencia;
	public long numero;
	public String titular;
	public double saldo;

//CONSTRUTOR
//	public Conta() {
//		setAgencia (1000);
//	}
	public Conta(long agencia) {
		this.agencia = agencia;
	}

//GETTERS E SETTERS
	public long getAgencia() {

		return agencia;
	}

	public void setAgencia(long agencia) {
		this.agencia = agencia;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

//OUTROS MÉTODOS
	public void sacar(double valor) {
		if (valor <= saldo) {
			setSaldo(saldo - valor);
		} else {
			System.out.println("Saldo insuficiênte");
		}
	}

	public void depositar(double valor) {
		setSaldo(saldo + valor);
	}

	public void consultar() {
		System.out.println(getSaldo());
	}

}
