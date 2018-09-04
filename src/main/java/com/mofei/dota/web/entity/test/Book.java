package com.mofei.dota.web.entity.test;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private Float price;
    private String description;
    private String isbn;
    private Integer nbOfPage;
    private Boolean illustrations;
//    @ElementCollection(fetch = FetchType.LAZY)
//    @CollectionTable(name = "Tag")
//    @Column(name = "Value")
//    private List<String> tags = new ArrayList<>(); // Constructors, getters, setters
}
