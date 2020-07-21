package com.matheusvoltane.controller;

import com.matheusvoltane.model.Aplicacoes;
import com.matheusvoltane.repository.AplicacoesDAO;

public class AplicacoesController {
	
	AplicacoesDAO aplicacaoDAO = new AplicacoesDAO();
	
	public void criarAplicacao (int numeroAplicacao, String nomeAplicacao) throws Exception {
		
		Aplicacoes aplicacao = new Aplicacoes(numeroAplicacao, nomeAplicacao);
		aplicacaoDAO.adicionar(aplicacao);
	}

	public void removerAplicacoa(Aplicacoes aplicacao) throws Exception {
		if (aplicacao != null) {
			aplicacaoDAO.remover(aplicacao);
		}
		
	}
}
