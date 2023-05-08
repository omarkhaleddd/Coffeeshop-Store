package com.coffeeshop.Repositories;

import com.coffeeshop.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product,Integer> {
}
