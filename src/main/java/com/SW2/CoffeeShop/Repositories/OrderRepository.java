package com.SW2.CoffeeShop.Repositories;


import com.SW2.CoffeeShop.Models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
