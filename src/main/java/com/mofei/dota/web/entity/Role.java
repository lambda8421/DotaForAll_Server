package com.mofei.dota.web.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Role {

    @Id
    @JsonIgnore
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "roles")
    private List<Hero> heroes;

    public Role() {
    }

    public Role(String name) {
        this.name = name;
    }
}
