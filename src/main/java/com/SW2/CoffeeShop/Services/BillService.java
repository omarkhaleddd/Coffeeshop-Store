package com.SW2.CoffeeShop.Services;


import com.SW2.CoffeeShop.Models.Bill;
import com.SW2.CoffeeShop.Repositories.BillRepository;
import org.springframework.stereotype.Service;

@Service
public class BillService {
    private final BillRepository billRepository;

    public BillService(BillRepository billRepository) {
        this.billRepository = billRepository;
    }
    //calculate subTotalCost implementation NEEDED!
    //calculate TotalCost implementation NEEDED!
    public double calculatesubTotalCost(Bill bill){



        return 0;
    }
    public double calculateTotalCost(Bill bill){return 0;}

}
