

package com.SW2.CoffeeShop.Controllers;
import com.SW2.CoffeeShop.Models.Order;
import com.SW2.CoffeeShop.Services.BaristaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Barista")
public class BaristaController {
    private final BaristaService barService;

    public BaristaController(BaristaService barService) {
        this.barService = barService;
    }
    @ResponseBody

    @PutMapping("/prepareOrder")
    public ResponseEntity<Order> prepareOrder(@RequestBody Order request){
        Order order = barService.prepareOrder(request);
        if (order != null)
        {
            return new ResponseEntity<Order>(request, HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<Order>(request,HttpStatus.BAD_REQUEST);
        }
    }
}
