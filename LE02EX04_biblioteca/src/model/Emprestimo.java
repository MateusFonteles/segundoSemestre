package model;

import java.util.Date;

public class Emprestimo {

	public Livro livro;
	public Pessoa pessoa;
	public int quantidade;
	public Date retirada; 
	public Date devolucao; 
	
	public void escreverEmprestimo() {
		livro.escreverLivro();
		pessoa.escreverPessoa();
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Retirada: " + retirada);
		System.out.println("Devolução: " + devolucao);
	}
}
