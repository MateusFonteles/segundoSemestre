package main;

import java.util.Calendar;

import model.Emprestimo;
import model.Livro;
import model.Pessoa;

public class Main {

	public static void main(String[] args) {

	Pessoa pessoa = new Pessoa();
	pessoa.nome = "Mateus";
	pessoa.matricula = "1234567";
	
	Livro livro = new Livro();
	livro.autor = "Lewis Caroll";
	livro.titulo = "Alice no país das maravilhas";
	livro.codigo = 12345;
	
	Emprestimo emprestimo = new Emprestimo();
	emprestimo.quantidade = 10; 
	emprestimo.retirada = Calendar.getInstance().getTime();
	emprestimo.devolucao = Calendar.getInstance().getTime();
	
	emprestimo.pessoa=pessoa;
	emprestimo.livro=livro;
	
	emprestimo.escreverEmprestimo();

}
}