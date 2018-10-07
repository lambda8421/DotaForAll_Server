package com.mofei.dota.web.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mofei.dota.web.base.AttackType;
import com.mofei.dota.web.entity.Role;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@JsonIgnoreProperties(value = { "roles" })
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
    private List<Role> roles;

    @JsonProperty("legs")
    private Integer legs;

    public Hero() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public void setLocalizedName(String localizedName) {
        this.localizedName = localizedName;
    }

    public String getPrimaryAttr() {
        return primaryAttr;
    }

    public void setPrimaryAttr(String primaryAttr) {
        this.primaryAttr = primaryAttr;
    }

    public AttackType getAttackType() {
        return attackType;
    }

    public void setAttackType(AttackType attackType) {
        this.attackType = attackType;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Integer getLegs() {
        return legs;
    }

    public void setLegs(Integer legs) {
        this.legs = legs;
    }
}

