package com.coffeeshop.Services;

import com.coffeeshop.Models.Bill;
import com.coffeeshop.Repositories.BillRepository;
import org.springframework.stereotype.Service;

@Service
public class BillService {
    private final BillRepository billRepository;

    public BillService(BillRepository billRepository) {
        this.billRepository = billRepository;
    }
    //calculate subTotalCost implementation NEEDED!
    //calculate TotalCost implementation NEEDED!
    public double calculatesubTotalCost(Bill bill){return 0;}
    public double calculateTotalCost(Bill bill){return 0;}

}
