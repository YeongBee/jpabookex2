package jpabook.jpabookex2.registration;

import jakarta.persistence.EntityManager;
import jpabook.jpabookex2.domain.*;
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

        Member member = new Member("MemberA", "거리", "대한민국");
        em.persist(member);

        Movie findMovie = em.find(Movie.class, movie.getId());
        System.out.println("findMovie = " + findMovie);

        Member findMember = em.getReference(Member.class, member.getId());

        em.clear();
        System.out.println("findMemberClass = " + findMember.getClass());

        System.out.println("isLoaded = " + em.getEntityManagerFactory().getPersistenceUnitUtil().isLoaded(findMember));

    }

    @Transactional
    public void parentChild(){
        Child child1 = new Child();
        Child child2 = new Child();

        Parent parent = new Parent();
        parent.addChild(child1);
        parent.addChild(child2);

       em.persist(parent);
    }
}
