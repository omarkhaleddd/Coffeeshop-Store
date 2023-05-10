package com.coffeeshop.Services;


import com.coffeeshop.Models.Bill;
import com.coffeeshop.Models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PayBillService {

    @Autowired
    private final BillService billService;

    public PayBillService(BillService billService) {
        this.billService = billService;
    }


    public void pay (Bill bill)
    {
        billService.calculateTotalCost(bill.getOrder());

        ArrayList<Product> products = new ArrayList<Product>();

//        print bill
         for (int i = 1 ; i <= products.size() ; i++)
         {
             System.out.println("no. "+i+"|  "+ products.get(i).getDescription());
         }
        System.out.println("total cost : "+bill.getTotalCost());



    }

}
