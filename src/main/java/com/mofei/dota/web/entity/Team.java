package com.mofei.dota.web.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Team {

    @Id
    private Long id;

    private String name;

    private String tag;

    private String logoUrl;
}
