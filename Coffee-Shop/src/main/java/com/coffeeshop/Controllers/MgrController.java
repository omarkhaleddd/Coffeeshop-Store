package com.coffeeshop.Controllers;



import com.coffeeshop.Models.Barista;
import com.coffeeshop.Services.BaristaService;
import com.coffeeshop.Services.ManagerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/Manager")
public class MgrController {

    private final ManagerService mgrService;
    private final BaristaService barService;

    public MgrController(ManagerService mgrService, BaristaService barService) {
        this.mgrService = mgrService;
        this.barService = barService;
    }

    //view Orders

    //add employee
    @PostMapping
    public void addBarista(@RequestBody Barista request){
        barService.createBarista(request);
    }
}
