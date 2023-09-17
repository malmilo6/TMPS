package domain;

import models.Publication;
import java.util.List;

public interface PublicationService {
    void addPublication(Publication publication);
    List<Publication> listPublications();
}

