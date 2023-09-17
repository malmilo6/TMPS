package domain;

import models.Publication;

import java.util.ArrayList;
import java.util.List;

public class MagazineServiceImpl implements PublicationService {
    private List<Publication> magazineList = new ArrayList<>();

    @Override
    public void addPublication(Publication publication) {
        magazineList.add(publication);
    }

    @Override
    public List<Publication> listPublications() {
        return magazineList;
    }
}

