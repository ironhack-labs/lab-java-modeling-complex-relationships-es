package com.asociacion.asociacionenfermeras;

import com.asociacion.asociacionenfermeras.model.Miembro;
import com.asociacion.asociacionenfermeras.Repositories.MiembroRepository;
import com.asociacion.asociacionenfermeras.model.Division;
import com.asociacion.asociacionenfermeras.model.Miembro.Status;
import java.time.LocalDate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AsociacionEnfermerasApplication{

    public static void main(String[] args) {
        SpringApplication.run(AsociacionEnfermerasApplication.class, args);
    }

    @Bean
    CommandLineRunner dataInitializer(com.asociacion.asociacionenfermeras.repository.DivisionRepository divisionRepository, MiembroRepository miembroRepository) {
        return args -> {
            // Create sample divisions
            Division division1 = new Division();
            division1.setName("Cardiology");
            division1.setDistrict("North District");
            divisionRepository.save(division1);

            Division division2 = new Division();
            division2.setName("Pediatrics");
            division2.setDistrict("South District");
            divisionRepository.save(division2);

            // Create sample members
            Miembro member1 = new Miembro();
            member1.setName("Alice");
            member1.setStatus(Status.ACTIVE);
            member1.setRenewalDate(LocalDate.now().plusYears(1));
            member1.setDivision(division1);
            miembroRepository.save(member1);

            Miembro member2 = new Miembro();
            member2.setName("Bob");
            member2.setStatus(Status.LAPSED);
            member2.setRenewalDate(LocalDate.now().minusMonths(6));
            member2.setDivision(division2);
            miembroRepository.save(member2);
        };
    }
}