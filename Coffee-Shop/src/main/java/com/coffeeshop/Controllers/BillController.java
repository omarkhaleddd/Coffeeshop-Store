package com.coffeeshop.Controllers;

import com.coffeeshop.Models.Bill;
import com.coffeeshop.Services.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BillController {

    @Autowired
    BillService billService ;
    @GetMapping("/bills/order")
    public ResponseEntity<List<Bill>> genrerateBill(@RequestParam("orderId") int orderId) {

        return ResponseEntity.ok(billService.generateBill(orderId));
    }


}
