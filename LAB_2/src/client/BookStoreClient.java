package client;

import domain.BookPool;
import domain.ConfigurationManager;
import domain.factory.BookStoreFactory;
import domain.factory.FantasyBookStore;
import domain.models.Book;

public class BookStoreClient {
    	public static void main(String[] args) {
    
        	ConfigurationManager configManager = ConfigurationManager.getInstance();
        	configManager.setStoreName("Awesome Book Store");

       
        	BookStoreFactory fantasyStore = new FantasyBookStore();
        	Book epicFantasy = fantasyStore.createBook("epic");

       
        	BookPool bookPool = new BookPool();
        	Book borrowedBook = bookPool.getBook();
        	bookPool.releaseBook(borrowedBook);

       
        	Book clonedBook = epicFantasy.clone();
    }
}

