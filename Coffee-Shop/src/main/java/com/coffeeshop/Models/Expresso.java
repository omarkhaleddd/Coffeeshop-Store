package com.coffeeshop.Models;

public class Expresso extends Beverage {
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
        this.description = description;
    }
}
