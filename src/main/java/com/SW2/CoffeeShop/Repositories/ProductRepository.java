package com.SW2.CoffeeShop.Repositories;


import com.SW2.CoffeeShop.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product,Integer> {
}
