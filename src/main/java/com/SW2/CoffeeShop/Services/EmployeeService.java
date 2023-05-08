package com.coffeeshop.Services;

import com.coffeeshop.Models.Employee;
import com.coffeeshop.Repositories.EmployeeRepository;
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
