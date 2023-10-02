package domain;

import domain.models.Book;

import java.util.ArrayList;
import java.util.List;

public class BookPool {
    	private List<Book> pool;
    	private static final int POOL_SIZE = 5;

    	public BookPool() {
        	pool = new ArrayList<>(POOL_SIZE);
        	for (int i = 0; i < POOL_SIZE; i++) {
            		pool.add(new Book("Default Title", "Default Author", 0.0));
        		}
    	}

    	public synchronized Book getBook() {
        	if (pool.size() > 0) {
            		return pool.remove(0);
        	}
        	return null;
    	}	

    	public synchronized void releaseBook(Book book) {
        	pool.add(book);
    	}
}

