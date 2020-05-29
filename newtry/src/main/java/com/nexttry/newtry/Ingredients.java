package com.nexttry.newtry;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Ingredients {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
    private String     Description;
    private BigDecimal amount ;

    @ManyToOne
private Recipe recipe;


    @OneToOne
private Unitofmeasure uom;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Unitofmeasure getUom() {
        return uom;
    }

    public void setUom(Unitofmeasure uom) {
        this.uom = uom;
    }
}
