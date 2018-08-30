package com.mofei.dota.web.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {

    @Id
    private Long id;

    private String name;


    public Role() {
    }
}
