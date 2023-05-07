package com.coffeeshop.Controllers;



import com.coffeeshop.Models.Barista;
import com.coffeeshop.Models.Cashier;
import com.coffeeshop.Services.BaristaService;
import com.coffeeshop.Services.CashierService;
import com.coffeeshop.Services.ManagerService;
import org.apache.coyote.Request;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Manager")
public class MgrController {

    private final ManagerService mgrService;
    private final BaristaService barService;

    private final CashierService cashierService;


    public MgrController(ManagerService mgrService, BaristaService barService, CashierService cashierService) {
        this.mgrService = mgrService;
        this.barService = barService;
        this.cashierService = cashierService;
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
}
