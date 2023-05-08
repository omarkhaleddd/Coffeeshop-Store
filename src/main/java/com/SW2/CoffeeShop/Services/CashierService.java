package com.coffeeshop.Services;

import com.coffeeshop.Models.Cashier;
import com.coffeeshop.Repositories.EmployeeRepository;
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
