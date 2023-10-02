package models;

public class Magazine implements Publication {
	private String title;
    	private String author;
    	private String ISBN;

    public Magazine(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Getters from Publication interface
	public String getTitle() { return title; }
    	public String getAuthor() { return author; }
    	public String getISBN() { return ISBN; }
	public String getType() { return type;}
}

