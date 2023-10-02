package models;

public class Book implements Publication {
    	private String title;

	private String author;
    	private String ISBN;

    public Book(String title, String author, String ISBN) {
        this.author = author;
        this.ISBN = ISBN;
    }


    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getISBN() {
        return ISBN;
    }
}

