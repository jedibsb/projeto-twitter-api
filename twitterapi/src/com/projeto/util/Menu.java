package com.projeto.util;

import java.util.Scanner;

public class Menu {
	
	
	public static int imprimirMenu() {		

		Scanner ler = new Scanner(System.in);
		int opcao = 0;

		System.out.println("\n\n ** PROJETO SISTEMAS CLIENTE SERVIDOR ** \n "
				+ "          ** TWITTER API ** \n");

		System.out.println("  1-Ver Timeline");
		System.out.println("  2-Postar Twitter");
		System.out.println("  3-Buscar Twitter");
		System.out.println("  4-Sair");		
		System.out.print("\n Digite uma das opcoes acima: ");
		
		opcao = ler.nextInt();		

		return opcao;
	}
}
