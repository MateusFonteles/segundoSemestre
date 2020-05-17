package model;

import java.util.Date;

public class Emprestimo {

//ATRIBUTOS	
	public Date retirada;
	public Date devolucao;
	public long codigoEmprestimo;
	public Usuario usuario;
	public Livro livro;

	// GETTERS E SETTERS
	public Date getRetirada() {
		return retirada;
	}

	public void setRetirada(Date retirada) {
		this.retirada = retirada;
	}

	public Date getDevolucao() {
		return devolucao;
	}

	public void setDevolucao(Date devolucao) {
		this.devolucao = devolucao;
	}

	public long getCodigoEmprestimo() {
		return codigoEmprestimo;
	}

	public void setCodigoEmprestimo(long codigoEmprestimo) {
		this.codigoEmprestimo = codigoEmprestimo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

//OUTROS MÉTODOS
	public void mostrarEmprestimo() {
		getLivro().mostrarLivro();
		getUsuario().mostrarUsuario();
		System.out.println("Retirada: " + getRetirada());
		System.out.println("Devolução: " + getDevolucao());
	}

}
