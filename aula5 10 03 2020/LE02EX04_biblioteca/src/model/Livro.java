package model;

public class Livro {

	public String autor;
	public String titulo; 
	public int codigo;
	
	public void escreverLivro() {
		System.out.println("Autor: " + autor);
		System.out.println("T�tulo: " +titulo);
		System.out.println("C�digo: " +codigo);
	}
	
}
