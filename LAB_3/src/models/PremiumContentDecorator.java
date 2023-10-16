package models;
import domain.ContentImpl;

public class PremiumContentDecorator implements Content {
    Content content;

    public PremiumContentDecorator(Content content) {
        this.content = content;
    }

    @Override
    public String show() {
        return content.show() + " with bonus annotations";
    }
}
