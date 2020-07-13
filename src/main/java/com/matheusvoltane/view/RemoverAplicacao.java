package com.matheusvoltane.view;

import java.util.Scanner;

import com.matheusvoltane.controller.AplicacoesController;
import com.matheusvoltane.model.Aplicacoes;

public class RemoverAplicacao {
	public void removerAplicacao() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("*** REMOVER APLICA��O");
		
		System.out.println("Nome da Aplica��o :");
		String nomeAplicacao = scan.nextLine();
		
		Aplicacoes aplicacao = new Aplicacoes();
		aplicacao.setNomeAplicacao(nomeAplicacao);
		
		AplicacoesController aplicacoesController = new AplicacoesController();
		try {
			aplicacoesController.removerAplicacoa (aplicacao);
			System.out.println("...");
			System.out.println("Aplica��o removida com sucesso!");
		} catch (Exception e) {
			System.out.println("Erro ocorrido: " + e.getMessage());
		}finally {
			scan.close();
		}
		
	}

}
