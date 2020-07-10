package com.matheusvoltane.model;

public class Aplicacoes {
	private int numeroAplicacao;
	private String nomeAplicacao;
	
	public Aplicacoes() {}
	
	public Aplicacoes(int numeroAplicacao, String nomeAplicacao) {
	}

	public int getNumeroAplicacao() {
		return numeroAplicacao;
	}

	public void setNumeroAplicacao(int numeroAplicacao) {
		if(numeroAplicacao > 0) {
		this.numeroAplicacao = numeroAplicacao;
		}
	}

	public String getNomeAplicacao() {
		return nomeAplicacao;
	}

	public void setNomeAplicacao(String nomeAplicacao) {
		this.nomeAplicacao = nomeAplicacao;
	}
	
	
}
