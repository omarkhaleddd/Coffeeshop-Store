package com.coffeeshop.Services;

import com.coffeeshop.Models.Bill;
import com.coffeeshop.Models.Order;
import com.coffeeshop.Repositories.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final OrderRepository orderRepository;
    public CustomerService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    public Bill payBill(Bill bill){
        return bill;
    }
    public Order recieveOrder(Order order){
        order.setStatus("Order Recieved //Bye Bye!");
        return order;
    }
}
