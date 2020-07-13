package com.matheusvoltane.view;

import java.util.Scanner;

import com.matheusvoltane.controller.AplicacoesController;

public class CriarAplicacaoConsole {
	public void criarAplicacao () {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("*** CADASTRO DE APLICACÃO ***\n");
		System.out.println("Numero da Aplicação: ");
		int numeroAplicacao = Integer.parseInt(scan.nextLine());
		System.out.println("Nome da Aplicação: ");
		String nomeAplicacao = scan.nextLine();
		System.out.println("ID da Aplicação: ");
		int idAplicacao = Integer.parseInt(scan.nextLine());
		
		AplicacoesController aplicacoesController = new AplicacoesController();
		try {
			aplicacoesController.criarAplicacao(numeroAplicacao, nomeAplicacao,idAplicacao);
			System.out.println("...");
			System.out.println("Aplicação criada com sucesso!");			
		} catch (Exception e) {
			System.out.println("Erro ocorrido: " + e.getMessage());
		}finally {
			scan.close();
		}
	}
}
