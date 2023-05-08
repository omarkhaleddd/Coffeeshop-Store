package com.SW2.CoffeeShop.Services;




import com.SW2.CoffeeShop.Models.Employee;
import com.SW2.CoffeeShop.Repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRepository empRepo;

    public EmployeeService(EmployeeRepository empRepo) {
        this.empRepo = empRepo;
    }

    public void createEmloyee(Employee emp){
        empRepo.save(emp);
    }
}
