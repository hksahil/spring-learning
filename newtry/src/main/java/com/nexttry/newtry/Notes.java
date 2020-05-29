package com.nexttry.newtry;

import javax.persistence.*;

@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    private String recipenotes;

    @OneToOne
private Recipe recipe;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRecipenotes() {
        return recipenotes;
    }

    public void setRecipenotes(String recipenotes) {
        this.recipenotes = recipenotes;
    }
}
