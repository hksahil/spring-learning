package com.nexttry.newtry;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Category {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

    private String description;

    @ManyToMany
    private Set<Recipe> recipies=new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Recipe> getRecipies() {
        return recipies;
    }

    public void setRecipies(Set<Recipe> recipies) {
        this.recipies = recipies;
    }
}
