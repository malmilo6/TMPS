package models;

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
        Content premiumContent = new PremiumContentDecorator(new Book());
        System.out.println(premiumContent.show());
    }
}
