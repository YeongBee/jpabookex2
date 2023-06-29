package jpabook.jpabookex2.domain;

import jakarta.persistence.*;
import jakarta.persistence.criteria.Order;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
public class Member {
/*
    @Id @GeneratedValue
    @Column(name = "member_id")
    */
    private Long id;
    private String name;
    private String street;
    private String zipcode;


    public Member(String name, String street, String zipcode) {
        this.name = name;
        this.street = street;
        this.zipcode = zipcode;
    }
}