package com.mofei.dota.web.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Chat {

    @Id
    private Long id;

    private Date time;

    private String content;

    // Chat type
    // private
}
