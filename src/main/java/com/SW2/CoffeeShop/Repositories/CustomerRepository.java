package com.coffeeshop.Repositories;

import com.coffeeshop.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
