package com.matheusvoltane.view;

import java.util.Scanner;

import com.matheusvoltane.controller.AplicacoesController;

public class CriarAplicacaoConsole {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("*** CADASTRO DE APLICAC�O ***\n");
		System.out.println("Numero da Aplica��o: ");
		int numeroAplicacao = Integer.parseInt(scan.nextLine());
		System.out.println("Nome da Aplica��o: ");
		String nomeAplicacao = scan.nextLine();
		
		AplicacoesController aplicacoesController = new AplicacoesController();
		try {
			aplicacoesController.criarAplicacao(numeroAplicacao, nomeAplicacao);
			System.out.println("...");
			System.out.println("Aplica��o criada com sucesso!");			
		} catch (Exception e) {
			System.out.println("Erro ocorrido: " + e.getMessage());
		}finally {
			scan.close();
		}
	}
}
