package domain.factory;

import domain.models.Book;

public class FantasyBookStore extends BookStoreFactory {
	@Override
    	public Book createBook(String type) {
        	if ("epic".equals(type)) {
            		return new Book("Epic Fantasy Title", "Author Name", 10.99);
        	} else if ("urban".equals(type)) {
            		return new Book("Urban Fantasy Title", "Author Name", 8.99);
        	}
       	return null;
    }
}

