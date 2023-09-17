package client;

import domain.PublicationService;
import domain.BookServiceImpl;
import domain.MagazineServiceImpl;
import factory.PublicationFactory;
import models.Publication;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PublicationService bookService = new BookServiceImpl();
        PublicationService magazineService = new MagazineServiceImpl();

        Publication book = PublicationFactory.createBook("1984", "George Orwell", "978-0451524935");
        Publication magazine = PublicationFactory.createMagazine("Time", "Time Inc.", "0032-7830");

        bookService.addPublication(book);
        magazineService.addPublication(magazine);

        printPublications(bookService.listPublications());
        printPublications(magazineService.listPublications());
    }

    private static void printPublications(List<Publication> publications) {
        for (Publication publication : publications) {
            System.out.println("Title: " + publication.getTitle() + ", Author: " + publication.getAuthor() + ", ISBN: " + publication.getISBN());
        }
    }
}

