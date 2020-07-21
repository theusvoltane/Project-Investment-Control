package com.matheusvoltane.model;

public class Aplicacoes {
	private int numeroAplicacao;
	private String nomeAplicacao;
//	private int idAplicacao;

	public Aplicacoes() {
	}

	public Aplicacoes(int numeroAplicacao, String nomeAplicacao) {
		super();
		setNumeroAplicacao(numeroAplicacao);
		setNomeAplicacao(nomeAplicacao);
//		setIdAplicacao(idAplicacao);
	}

	public int getNumeroAplicacao() {
		return numeroAplicacao;
	}

	public void setNumeroAplicacao(int numeroAplicacao) {
		if (numeroAplicacao > 0) {
			this.numeroAplicacao = numeroAplicacao;
		}
	}

	public String getNomeAplicacao() {
		return nomeAplicacao;
	}

	public void setNomeAplicacao(String nomeAplicacao) {
		this.nomeAplicacao = nomeAplicacao;
	}
/*
	public int getIdAplicacao() {
		return idAplicacao;
	}

	public void setIdAplicacao(int idAplicacao) {
		if (idAplicacao > 0) {
			this.idAplicacao = idAplicacao;
		}
	}
*/
	@Override
	public String toString() {
		return String.format("%-8d", this.getNumeroAplicacao()).concat
				(String.format("%-60s", this.getNomeAplicacao()));
//				.concat(String.format("%-8d", getIdAplicacao()));
	}

}
