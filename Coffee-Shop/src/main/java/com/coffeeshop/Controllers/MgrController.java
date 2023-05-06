package com.coffeeshop.Controllers;

import Repositories.ManagerRepository;
import com.coffeeshop.Models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("api/v1/manager")
public class MgrController {

    private final ManagerRepository managerRepository;

    public MgrController(ManagerRepository managerRepository) {
        this.managerRepository = managerRepository;
    }


    //view Orders

    //add employee
    @PostMapping
    public void addEmployee(@RequestBody Employee request){
        Employee employee = new Employee();
        employee.setName(request.getName());
        employee.setEmail(request.getEmail());
        managerRepository.save(employee);
    }
}
