package com.coffeeshop.Models;

import jakarta.persistence.*;

@Entity
public abstract class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    protected Integer id ;
    protected double price;
    protected String description;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    };

    public abstract String getDescription();
    public abstract double cost();

    public abstract void setDescription(String description);

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}