package com.bgi.launchpad.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Committee")
public class Committee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
