package com.coffeeshop.Services;

import com.coffeeshop.Models.Beverage;
import com.coffeeshop.Models.Product;
import com.coffeeshop.Repositories.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class BeverageService {
    private final ProductRepository productRepository;

    public BeverageService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public Beverage createBeverage(Beverage beverage){
        return productRepository.save(beverage);
    }
}
