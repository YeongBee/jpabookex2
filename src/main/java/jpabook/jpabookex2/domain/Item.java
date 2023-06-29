package jpabook.jpabookex2.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "Dty")
public class Item {

    @Id @GeneratedValue
    private Long id;

    protected String name;
    protected int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
