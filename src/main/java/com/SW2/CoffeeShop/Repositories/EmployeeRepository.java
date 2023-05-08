package com.SW2.CoffeeShop.Repositories;

import com.SW2.CoffeeShop.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
