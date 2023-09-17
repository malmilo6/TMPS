package domain;

import models.Publication;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements PublicationService {
    private List<Publication> bookList = new ArrayList<>();

    @Override
    public void addPublication(Publication publication) {
        bookList.add(publication);
    }

    @Override
    public List<Publication> listPublications() {
        return bookList;
    }
}

