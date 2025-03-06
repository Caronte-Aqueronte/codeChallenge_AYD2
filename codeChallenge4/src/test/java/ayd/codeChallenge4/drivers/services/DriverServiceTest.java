/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ayd.codeChallenge4.drivers.services;

import ayd.codeChallenge4.drivers.models.Driver;
import ayd.codeChallenge4.drivers.repositories.DriverRepository;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author Luis Monterroso
 */
public class DriverServiceTest {

    @Mock
    private DriverRepository driverRepository;

    @InjectMocks
    private DriverService driverService;

    private Driver driver;

    /**
     * Este metodo se ejecuta antes de cualquier prueba individual, se hace para
     * inicializar los moks ademas del driver
     */
    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        driver = new Driver("Luis", 23);

    }

    @Test
    void testInsertDriverWhenDriverExists() {
        //preparacion
        when(driverRepository.existsByName(driver.getName())).thenReturn(true);

        //ejecucion
        Driver result = driverService.insertDriver(driver);

        //Resultado
        //el resultado debe ser nulo porque ya existe
        assertNull(result);

        //verificamos que save no se llamo
        verify(driverRepository, never()).save(null);
    }

    @Test
    void testInsertDriverWhenDriverNotFExists() {
        //Preparacion
        //cuando el metodo existsByName sea llamado con el nombre del driver entonces este devolvera falso
        when(driverRepository.existsByName(driver.getName())).thenReturn(false);

        //Ejecucion
        //testamos el metodo de insertDriver
        Driver result = driverService.insertDriver(driver);

        //Resultado 
        //el resultado debe ser nulo porque ya existe
        assertNull(result);

        //verificamos que save se llamo una vez
        verify(driverRepository, times(1)).save(driver);
    }

}
