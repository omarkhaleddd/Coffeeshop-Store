package com.coffeeshop.Controllers;



import com.coffeeshop.Models.Barista;
import com.coffeeshop.Models.Beverage;
import com.coffeeshop.Models.Cashier;
import com.coffeeshop.Models.Product;
import com.coffeeshop.Services.BaristaService;
import com.coffeeshop.Services.BeverageService;
import com.coffeeshop.Services.CashierService;
import com.coffeeshop.Services.ManagerService;
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
