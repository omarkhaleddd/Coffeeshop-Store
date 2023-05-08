package com.SW2.CoffeeShop.Repositories;


import com.SW2.CoffeeShop.Models.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill,Integer> {

}
