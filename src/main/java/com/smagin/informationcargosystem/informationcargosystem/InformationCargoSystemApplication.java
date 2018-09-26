package com.smagin.informationcargosystem.informationcargosystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InformationCargoSystemApplication {

    @Autowired
    private CargoRepository cargoRepository;

    public static void main(String[] args) {
        SpringApplication.run(InformationCargoSystemApplication.class, args);
    }

    @Bean
    CommandLineRunner runner() {
		return args -> {
			cargoRepository.save(new Cargo(1L, "Plita", 10, CargoStatus.CARGORED));
			cargoRepository.save(new Cargo(2L, "Plita2", 11, CargoStatus.DELIVERED));
			cargoRepository.save(new Cargo(3L, "Plita3", 12, CargoStatus.PREPARED));
			cargoRepository.save(new Cargo(4L, "Plita4", 13, CargoStatus.DELIVERED));
			cargoRepository.save(new Cargo(5L, "Plita5", 13, CargoStatus.PREPARED));
			cargoRepository.save(new Cargo(6L, "Plita6", 12, CargoStatus.CARGORED));
			cargoRepository.save(new Cargo(7L, "Plita7", 12, CargoStatus.CARGORED));
			cargoRepository.save(new Cargo(8L, "Plita8", 12, CargoStatus.CARGORED));
			cargoRepository.save(new Cargo(9L, "Plita9", 12, CargoStatus.PREPARED));

		};
	}


}
