package com.projeto.util;

import java.util.Scanner;

import com.projeto.config.Configuracao;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class Twittar {
		
	Scanner ler;
	
	public void postarTweet()  {

		Configuracao c = new Configuracao();
		ler = new Scanner(System.in);

		TwitterFactory tf = new TwitterFactory(c.getConfiguracao().build());
		Twitter twitter = tf.getInstance();

		System.out.println("Entre com a mensagem: ");
		String tweet = ler.nextLine();

		try {
			/*
			 * metodo: updateStatus()
			 * realiza um tweet
			 * chama: https://api.twitter.com/1.1/statuses/update
			 */
			twitter.updateStatus(tweet);
			System.out.println("Tweet postado com sucesso!");
		}
		catch(TwitterException e) { e.printStackTrace(); }		

	}

}
