package com.mofei.dota.web.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Role {

    @Id
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "roles")
    private List<Hero> heroes;

    public Role() {
    }
}
