package com.mofei.dota.web.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mofei.dota.web.base.AttackType;
import com.mofei.dota.web.entity.Role;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Hero implements Serializable {

    @Id
    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("localized_name")
    private String localizedName;

    @JsonProperty("primary_attr")
    private String primaryAttr;

    @JsonProperty("attack_type")
    private AttackType attackType;

    @ManyToMany
    @JoinTable(name = "hero_role",
            joinColumns = @JoinColumn(name = "hero_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    @JsonProperty("roles")
    private List<Role> roles;

    @JsonProperty("legs")
    private Integer legs;

    public Hero() {
    }
}

