package com.nexttry.newtry;

import javax.persistence.*;
import java.util.*;

@Entity
public class Recipe {

    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   private String description;
    private Integer preptime;
    private Integer cooktime;
    private Integer servings;
    private String source;
    private String url;


    @ManyToMany
    private Set<Category> categories=new HashSet<>();

    @OneToMany
 private Set<Ingredients> ingredients =new HashSet<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToOne
    private Notes notes;



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPreptime() {
        return preptime;
    }

    public void setPreptime(Integer preptime) {
        preptime = preptime;
    }

    public Integer getCooktime() {
        return cooktime;
    }

    public void setCooktime(Integer cooktime) {
        cooktime = cooktime;
    }

    public Integer getServings() {
        return servings;
    }

    public void setServings(Integer servings) {
        servings = servings;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        source = source;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        url = url;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public Set<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }
}
