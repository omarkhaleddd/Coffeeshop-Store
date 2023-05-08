package com.SW2.CoffeeShop.Models;


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
    private String Status;

    public Order(Integer id, ArrayList<Product> products, String status) {
        this.id = id;
        Products = products;
        Status = status;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public Order() {
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, Products, Status);
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
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", Products=" + Products +
                ", Status ="+Status+
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) && Objects.equals(Products, order.Products) && Objects.equals(Status, order.Status);
    }

}
