package com.coffeeshop.Models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Objects;

@Entity
@Table(name = "`Order`")
public class Order {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @OneToMany
    private ArrayList<Product> Products;

    public Order() {
    }

    public Order(Integer id, ArrayList<Product> products) {
        this.id = id;
        Products = products;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ArrayList<Product> getProducts() {
        return Products;
    }

    public void setProducts(ArrayList<Product> products) {
        Products = products;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) && Objects.equals(Products, order.Products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Products);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", Products=" + Products +
                '}';
    }
}
