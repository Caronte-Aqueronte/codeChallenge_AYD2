/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ayd.codeChallenge4.drivers.services;

import ayd.codeChallenge4.drivers.models.Driver;
import ayd.codeChallenge4.drivers.repositories.DriverRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author Luis Monterroso
 */
@Service
@RequiredArgsConstructor
public class DriverService {

    private final DriverRepository driverRepository;


    public Driver insertDriver(Driver driver) {
        //buscar que no haya un dfiver con el mismo nombre
        if (driverRepository.existsByName(driver.getName())) {
            return null;
        }
        //de lo contratrio entonces insertar
        return driverRepository.save(driver);
    }

    public List<Driver> gerDrivers() {
        return driverRepository.findAll();
    }
}
