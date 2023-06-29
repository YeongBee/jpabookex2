package jpabook.jpabookex2.registration;

import jakarta.persistence.EntityManager;
import jpabook.jpabookex2.domain.Album;
import jpabook.jpabookex2.domain.Item;
import jpabook.jpabookex2.domain.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Component
public class CreateRegistration {

    private final EntityManager em;

    @Transactional
    public void create(){

        Movie movie = new Movie("Movie Name", 1000, "AAA", "BBB");
        em.persist(movie);

        Album album = new Album("좋은날", 20000, "아이유");

        em.persist(album);

        em.flush();
        em.clear();

        Movie findMovie = em.find(Movie.class, movie.getId());
        System.out.println("findMovie = " + findMovie);

    }
}
