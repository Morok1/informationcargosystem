package com.smagin.informationcargosystem.informationcargosystem;

import com.smagin.informationcargosystem.informationcargosystem.Cargo;
import com.smagin.informationcargosystem.informationcargosystem.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CargoService {
    @Autowired
    private CargoRepository cargoRepository;

    /*public Collection<Cargo> getById(Long id){
        return
    }*/
    public Iterable<Cargo> findAll(){
        return cargoRepository.findAll();
    }
}
