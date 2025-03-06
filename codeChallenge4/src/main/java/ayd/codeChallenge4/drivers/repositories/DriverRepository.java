/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ayd.codeChallenge4.drivers.repositories;

import ayd.codeChallenge4.drivers.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Luis Monterroso
 */
@Repository
public interface DriverRepository extends JpaRepository<Driver, String> {

    public boolean existsByName(String name);
}
