package jpabook.jpabookex2.domain;

import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Album extends Item{

    private String artist;

    public Album(String name, int price, String artist) {
        super(name, price);
        this.artist = artist;
    }
}
