package main;

import java.util.Date;

import model.Emprestimo;
import model.Livro;
import model.Usuario;

public class Main {

	public static void main(String[] args) {

//USUÁRIOS	
	Usuario usuario1 = new Usuario();
	usuario1.setNome("Mateus");
	usuario1.setCadastro(123456789);
	
	Usuario usuario2 = new Usuario();
	usuario1.setNome("Fabiana");
	usuario1.setCadastro(1011121314);

//LIVROS
	Livro livro1 = new Livro();
	livro1.setTitulo("Alice no País das Maravilhas");
	livro1.setAutor("Lewis Caroll");
	livro1.setCodigo(987654321);

	Livro livro2 = new Livro();
	livro1.setTitulo("Mil Anos de Solidão");
	livro1.setAutor("Gabriel Garcia Marques");
	livro1.setCodigo(1413121110);
	
//EMPRÉSTIMOS
	Emprestimo emprestimo1 = new Emprestimo();
	emprestimo1.setUsuario(usuario1);
	emprestimo1.setLivro(livro1);
	emprestimo1.setCodigoEmprestimo(456654);
	emprestimo1.retirada = new Date();
	emprestimo1.devolucao = new Date(emprestimo1.retirada.getTime() + (1000 * 60 * 60 * 240));
	
	Emprestimo emprestimo2 = new Emprestimo();
	emprestimo2.setUsuario(usuario2);
	emprestimo2.setLivro(livro2);
	emprestimo2.setCodigoEmprestimo(456655);
	emprestimo2.retirada = new Date();
	emprestimo2.devolucao = new Date(emprestimo2.retirada.getTime() + (1000 * 60 * 60 * 240));
	
//MOSTRAR EMPRÉSTIMOS
	emprestimo1.mostrarEmprestimo();	
	emprestimo2.mostrarEmprestimo();
	}
}
