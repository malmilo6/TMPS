package models;
import domain.ContentImpl;

public class Book implements ContentImpl {
	@Override
	public String show() {
		return "Book content";
	}
}
