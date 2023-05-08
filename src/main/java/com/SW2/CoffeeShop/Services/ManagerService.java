package com.coffeeshop.Services;


import com.coffeeshop.Repositories.ManagerRepository;
import org.springframework.stereotype.Service;


@Service
public class ManagerService {

    private final ManagerRepository mgrRepo;
    public ManagerService(ManagerRepository mgrRepo) {
        this.mgrRepo = mgrRepo;
    }

}
