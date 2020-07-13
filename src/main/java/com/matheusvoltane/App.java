package com.matheusvoltane;

import java.util.Scanner;

import com.matheusvoltane.view.CriarAplicacaoConsole;
import com.matheusvoltane.view.RemoverAplicacao;

public class App {
	@SuppressWarnings( "resource" )
	public static void main(String[] args) {
		System.out.println("*** APLICA��ES ***");
		System.out.println("\n***Digite a op��o que deseja\n 1 - criar\n 2 - remover");

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite: ");
		int opcao = Integer.parseInt(scan.nextLine());

		if (opcao == 1) {
			CriarAplicacaoConsole  criar = new CriarAplicacaoConsole();
			
			criar.criarAplicacao();
		} else {
			RemoverAplicacao remover = new RemoverAplicacao();
			
			remover.removerAplicacao();

		}

	}
}