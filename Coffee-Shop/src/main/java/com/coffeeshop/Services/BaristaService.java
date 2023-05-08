package com.coffeeshop.Services;

import com.coffeeshop.Models.Barista;
import com.coffeeshop.Models.Order;
import com.coffeeshop.Repositories.EmployeeRepository;
import com.coffeeshop.Repositories.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class BaristaService {
    private final EmployeeRepository empRepo;
    private final OrderService orderService;
    public BaristaService(EmployeeRepository empRepo, OrderRepository orderRepository, OrderService orderService) {
        this.empRepo = empRepo;
        this.orderService = orderService;
    }

    public Barista createBarista(Barista barista){
        return empRepo.save(barista);
    }
    public Order prepareOrder(Order order){
      order.setStatus("Order ready!");
      orderService.updateOrder(order);
      return order;
    };
}
