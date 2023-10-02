package domain.factory;

import domain.models.Book;

public abstract class BookStoreFactory {
	public abstract Book createBook(String type);
}

