package factory;

import models.Book;
import models.Magazine;
import models.Publication;

public class PublicationFactory {
    public static Publication createBook(String title, String author, String ISBN) {
        return new Book(title, author, ISBN);
    }

    public static Publication createMagazine(String title, String author, String ISBN) {
        return new Magazine(title, author, ISBN);
    }
}

