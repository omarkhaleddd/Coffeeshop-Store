package com.SW2.CoffeeShop.Controllers;


import com.SW2.CoffeeShop.Models.Barista;
import com.SW2.CoffeeShop.Models.Beverage;
import com.SW2.CoffeeShop.Models.Cashier;
import com.SW2.CoffeeShop.Services.BaristaService;
import com.SW2.CoffeeShop.Services.BeverageService;
import com.SW2.CoffeeShop.Services.CashierService;
import com.SW2.CoffeeShop.Services.ManagerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Manager")
public class MgrController {

    private final ManagerService mgrService;
    private final BaristaService barService;

    private final CashierService cashierService;
    private final BeverageService beverageService;


    public MgrController(ManagerService mgrService, BaristaService barService, CashierService cashierService, BeverageService beverageService) {
        this.mgrService = mgrService;
        this.barService = barService;
        this.cashierService = cashierService;
        this.beverageService = beverageService;
    }

    //view Orders

    //add employee
    @ResponseBody

    @PostMapping("/addBarista")
    public ResponseEntity<Barista> addBarista(@RequestBody Barista request){
        Barista barista = barService.createBarista(request);
        if (barista != null)
        {
            return new ResponseEntity<Barista>(request, HttpStatus.OK);
        }
        else
         {
            return new ResponseEntity<Barista>(request,HttpStatus.BAD_REQUEST);
         }
    }
    @ResponseBody
    @PostMapping("/addCashier")
    public ResponseEntity<Cashier> addCashier(@RequestBody Cashier request){
        Cashier cashier = cashierService.createCashier(request);
        if (cashier != null)
        {
            return new ResponseEntity<Cashier>(request, HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<Cashier>(request, HttpStatus.BAD_REQUEST);
        }
    }
    @ResponseBody
    @PostMapping("/addBeverage")
    public ResponseEntity<Beverage> addBeverage(@RequestBody Beverage request){
        Beverage beverage = beverageService.createBeverage(request);
        if (beverage != null)
        {
            return new ResponseEntity<Beverage>(request, HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<Beverage>(request, HttpStatus.BAD_REQUEST);
        }
    }
}
