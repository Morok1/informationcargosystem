package com.smagin.informationcargosystem.informationcargosystem;

import com.smagin.informationcargosystem.informationcargosystem.Cargo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.smagin.informationcargosystem.informationcargosystem.CargoService;

@RestController
public class Controller {
    @Autowired
    private CargoService cargoService;

    @RequestMapping(value = "/cars")
    public Iterable<Cargo> findAll(){
        return cargoService.findAll();
    }
}
