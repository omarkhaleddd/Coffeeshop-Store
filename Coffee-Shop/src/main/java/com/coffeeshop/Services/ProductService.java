package com.coffeeshop.Services;

import com.coffeeshop.Models.Order;
import com.coffeeshop.Models.Product;
import com.coffeeshop.Repositories.ProductRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(Product product){
        return productRepository.save(product);
    }
    public List<Product> getProducts(){
        List<Product> products  = productRepository.findAll();
        return products;
    }

    public Product updateProduct(Product product){
        return productRepository.save(product);
    }
    //parameter name and return product
    public ArrayList<Product> findProductsByIds(ArrayList<Integer> productIds){
        ArrayList<Product> products = new ArrayList<Product>();
        System.out.println("size is " + productIds.size());
        for (int i = 0; i < productIds.size(); i++) {
            Optional<Product> prod = productRepository.findById(productIds.get(i));
            products.add(i,prod.orElse(null));
        }
        System.out.println("products : " + products);
        return products;
    }


    public boolean deleteProduct(Integer id){
        productRepository.deleteById(id);
        if (productRepository.existsById(id)){
            return false;
        }
        return true;
    }
}
