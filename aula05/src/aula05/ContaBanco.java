package aula05;

public class ContaBanco {

//DECLARAÇÃO DE ATRIBUTOS
	public int numConta;
	protected String Tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	
	// MÉTODO CONSTRUTOR 
	
	// MÉTODOS GET/SET
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double Saldo) {
		this.saldo = saldo;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	// MÉTODOS ESPECÍFICOS
	
	public boolean abrirConta() {
		setStatus(true);
		return isStatus();
		
	}
	 public boolean fecharConta() {
			 setStatus(false);		 
	}
	 
	 public int depositar(int deposito) {
		 setSaldo(getSaldo() + deposito);
	 }
	 
	 public int sacar(int saque) {
		 if (getSaldo() == saque) {
			 setSaldo(getSaldo() - saque);
		 }
		 
	 public int pagarMensal() {
		 if (tipo == CC) {
			 saldo = saldo - 50;
		 }
		 if (tipo  == CP) {
			 saldo = saldo - 20;
		 }
	 }
	 }
	
	
	}
