package com.projeto.util;

import java.util.List;
import java.util.Scanner;

import com.projeto.config.Configuracao;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class Buscar {

	Scanner ler;
	
	public void buscarTweet() {

		Configuracao c = new Configuracao();	
		ler = new Scanner(System.in);

		TwitterFactory tf = new TwitterFactory(c.getConfiguracao().build());
		Twitter twitter = tf.getInstance();
		
		try {
			System.out.print("Entre com palavra(s) para buscar: ");
			String busca = ler.nextLine();
            Query query = new Query(busca);
            QueryResult result;
            
            do {
            	/*
            	 * metodo search()
            	 * realiza uma busca geral no twitter
            	 * chama: http://search.twitter.com/search.json
            	 */
                result = twitter.search(query);
                List<Status> tweets = result.getTweets();
                
                for (Status tweet : tweets) {
                    System.out.println("@" + tweet.getUser().getScreenName() + "\nMENSAGEM " + tweet.getText() + "\n\n");
                }                
            } while ((query = result.nextQuery()) != null);            
        } 
		catch (TwitterException e) { e.printStackTrace(); }
		
    }	
}
