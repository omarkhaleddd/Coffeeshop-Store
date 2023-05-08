package com.SW2.CoffeeShop.Services;


import com.SW2.CoffeeShop.Models.Cashier;
import com.SW2.CoffeeShop.Repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class CashierService {
    private final EmployeeRepository empRepo ;

    public CashierService(EmployeeRepository empRepo) {
        this.empRepo = empRepo;
    }
    public Cashier createCashier(Cashier cashier){
        return empRepo.save(cashier);

    }
}
