package com.SW2.CoffeeShop.Models;

import jakarta.persistence.Entity;

@Entity
public class Barista extends Employee{
    public void prepareOrder(){
        System.out.println("Preparing Order...");
    }
}
