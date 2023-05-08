package com.SW2.CoffeeShop.Services;



import com.SW2.CoffeeShop.Repositories.ManagerRepository;
import org.springframework.stereotype.Service;


@Service
public class ManagerService {

    private final ManagerRepository mgrRepo;
    public ManagerService(ManagerRepository mgrRepo) {
        this.mgrRepo = mgrRepo;
    }

}
