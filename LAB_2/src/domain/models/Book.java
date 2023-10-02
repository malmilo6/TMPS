package domain.models;

public class Book {	
	private String title;
    	private String author;
    	private double price;

    	public Book(String title, String author, double price) {
        	this.title = title;
        	this.author = author;
        	this.price = price;
    	}

	

    	@Override
    	public Book clone() {
        	return new Book(this.title, this.author, this.price);
    	}
}

