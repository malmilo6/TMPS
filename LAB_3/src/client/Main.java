package client;

import models.LibraryFacade;

public class Main {
    public static void main(String[] args) {
        LibraryFacade library = new LibraryFacade();

        library.playMedia();
        library.accessContent();
        library.showPremiumContent();
    }
}
