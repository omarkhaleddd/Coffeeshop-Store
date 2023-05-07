package com.coffeeshop.Controllers;



import com.coffeeshop.Models.Employee;
import com.coffeeshop.Services.EmployeeService;
import com.coffeeshop.Services.ManagerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/Manager")
public class MgrController {

    private final ManagerService mgrService;
    private final EmployeeService empService;

    public MgrController(ManagerService mgrService, EmployeeService empService) {
        this.mgrService = mgrService;
        this.empService = empService;
    }

    //view Orders

    //add employee
    @PostMapping
    public void addEmployee(@RequestBody Employee request){
        empService.createEmloyee(request);
    }
}
