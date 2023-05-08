package com.coffeeshop.Models;

import jakarta.persistence.*;

@Entity
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @OneToOne
    private Order order;

    public Bill() {
    }

    public Bill(Integer id, Order order) {
        this.id = id;
        this.order = order;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
