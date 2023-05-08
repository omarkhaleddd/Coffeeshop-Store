package com.SW2.CoffeeShop.Services;


import com.SW2.CoffeeShop.Models.Bill;
import com.SW2.CoffeeShop.Models.Order;
import com.SW2.CoffeeShop.Repositories.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final OrderService orderService;
    private final BillService billService;
    public CustomerService(OrderRepository orderRepository, OrderService orderService, BillService billService) {
        this.orderService = orderService;
        this.billService = billService;
    }
    //place Order
    public Order placeOrder(Order order){
        orderService.createOrder(order);
        return order;
    }
    public double payBill(Bill bill){
        Order order = bill.getOrder();
        order.setStatus("Order Payed");
        orderService.updateOrder(order);
        return billService.calculateTotalCost(bill);
    }
    public Order recieveOrder(Order order){
        order.setStatus("Order Recieved //Bye Bye!");
        orderService.updateOrder(order);
        return order;
    }
}
