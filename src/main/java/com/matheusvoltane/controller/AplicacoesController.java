package com.matheusvoltane.controller;

import com.matheusvoltane.model.Aplicacoes;
import com.matheusvoltane.repository.AplicacoesDAO;

public class AplicacoesController {
	
	AplicacoesDAO aplicacoesDAO = new AplicacoesDAO();
	
	public void criarAplicacao (int numeroAplicacao, String nomeAplicacao) throws Exception {
		
		Aplicacoes aplicacao = new Aplicacoes(numeroAplicacao, nomeAplicacao);
		aplicacoesDAO.adicionar(aplicacao);
	}
}
