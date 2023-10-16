package models;
import domain.ContentImpl;

public class PremiumContentDecorator implements ContentImpl {
    ContentImpl content;

    public PremiumContentDecorator(ContentImpl content) {
        this.content = content;
    }

    @Override
    public String show() {
        return content.show() + " with bonus annotations";
    }
}
