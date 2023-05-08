package com.SW2.CoffeeShop.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Food extends Product{

    private String name ;

    public Food() {
    }
    public Food(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public double cost() {
        return 0;
    }

    @Override
    public void setDescription(String description) {

    }
}
