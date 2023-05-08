package com.coffeeshop.Models;

import jakarta.persistence.Entity;

@Entity
public class Beverage extends Product{

    @Override
    public String getDescription() {
        return description;
    }
    //we didnt implement cost
    @Override
    public double cost() {
        return 0;
    }

    @Override
    public void setDescription(String description) {
        super.description = description; ;
    }
}
