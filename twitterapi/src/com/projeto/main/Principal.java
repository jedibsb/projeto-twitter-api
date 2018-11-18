package com.projeto.main;

import com.projeto.util.*;

public class Principal {

	public static void main (String[] args) {
		
		int opcao = 0;
		
		do {
			
			opcao = Menu.imprimirMenu();
			
			switch(opcao) {
			
				case 1 : new TimeLine().linhaDoTempo();
						break;
				case 2 : new Twittar().postarTweet();
						break;
				case 3 : new Buscar().buscarTweet();
						break;
				case 4 : System.out.println("Fechando...");
						break;
				default: System.out.println("OPCAO INVALIDA!");
			}
		
		} while(opcao != 4);
		
		System.out.println("Saiu com sucesso\n");
		System.exit(0);		
		
	}
}
