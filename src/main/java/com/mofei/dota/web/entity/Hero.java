package com.mofei.dota.web.entity;

import com.mofei.dota.web.base.AttackType;
import com.mofei.dota.web.entity.Role;

import javax.persistence.*;
import java.util.List;

@Entity
public class Hero {

    @Id
    private Long id;

    private String name;

    private String localizedName;
    private String primaryAttr;
    private AttackType attackType;

   @ManyToMany
   @JoinTable(name = "hero_role",
           joinColumns = @JoinColumn(name = "hero_id"),
           inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Role> roles;

    private Integer legs;

    public Hero() {
    }
}

