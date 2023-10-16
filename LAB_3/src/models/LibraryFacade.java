package models;
import domain.ContentImpl;

public class LibraryFacade {
    MediaAdapter mediaAdapter = new MediaAdapter();
    ProxyContent proxyContent = new ProxyContent();

    public void playMedia() {
        mediaAdapter.play();
    }

    public void accessContent() {
        proxyContent.access();
    }

    public void showPremiumContent() {
        ContentImpl premiumContent = new PremiumContentDecorator(new Book());
        System.out.println(premiumContent.show());
    }
}
