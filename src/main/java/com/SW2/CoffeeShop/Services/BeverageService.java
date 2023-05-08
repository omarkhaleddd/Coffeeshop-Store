package com.SW2.CoffeeShop.Services;


import com.SW2.CoffeeShop.Models.Beverage;
import com.SW2.CoffeeShop.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
