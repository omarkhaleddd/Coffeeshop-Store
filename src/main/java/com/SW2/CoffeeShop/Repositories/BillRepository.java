package com.coffeeshop.Repositories;

import com.coffeeshop.Models.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill,Integer> {

}
