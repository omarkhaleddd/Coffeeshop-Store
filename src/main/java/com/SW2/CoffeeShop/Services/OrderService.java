package com.coffeeshop.Services;

import com.coffeeshop.Models.Order;
import com.coffeeshop.Models.Product;
import com.coffeeshop.Repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private final OrderRepository orderRepo;

    public OrderService(OrderRepository orderRepo) {
        this.orderRepo = orderRepo;
    }

    public Order createOrder(Order order){
        return orderRepo.save(order);
    }

    public Order getOrderById(int id){
        Optional<Order> order = orderRepo.findById(id);
        return order.orElse(null);
    }

    public Order updateOrder(Order order){
        return orderRepo.save(order);
    }

    public void deleteOrder(Order order){
        orderRepo.delete(order);
    }

    public Order addProductToOrder(Product product,Order order){
        ArrayList<Product> prodArr = order.getProducts();
        prodArr.add(product);
        order.setProducts(prodArr);
        return order;
    }
}
