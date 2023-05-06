package Repositories;

import com.coffeeshop.Customer;
import com.coffeeshop.Models.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface ManagerRepository extends JpaRepository<Manager,Integer> {

}


