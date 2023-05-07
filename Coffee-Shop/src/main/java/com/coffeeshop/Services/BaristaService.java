package com.coffeeshop.Services;

import com.coffeeshop.Models.Barista;
import com.coffeeshop.Repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class BaristaService {
    private final EmployeeRepository empRepo;
    public BaristaService(EmployeeRepository empRepo) {
        this.empRepo = empRepo;
    }

    public Barista createBarista(Barista barista){
        return empRepo.save(barista);
    }
}
