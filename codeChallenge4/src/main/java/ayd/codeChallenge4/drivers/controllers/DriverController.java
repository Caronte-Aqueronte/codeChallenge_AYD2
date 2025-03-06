/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ayd.codeChallenge4.drivers.controllers;

import ayd.codeChallenge4.drivers.dto.DriverCreateDto;
import ayd.codeChallenge4.drivers.dto.DriverResponseDto;
import ayd.codeChallenge4.drivers.mappers.DriverMapper;
import ayd.codeChallenge4.drivers.models.Driver;
import ayd.codeChallenge4.drivers.services.DriverService;
import jakarta.validation.Valid;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Luis Monterroso
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/drivers")
public class DriverController {

    private final DriverService driverService;
    private final DriverMapper driverMapper;

    @PostMapping("/createDriver")
    public ResponseEntity<DriverResponseDto> login(
            @RequestBody @Valid DriverCreateDto request) {
        Driver driverToInsert = driverMapper.fromCreateDtoToDriver(request);
        Driver driver = driverService.insertDriver(driverToInsert);
        DriverResponseDto dto = driverMapper.fromDriverToDto(driver);
        return ResponseEntity.ok(dto);
    }

    @GetMapping("/findDrivers")
    public ResponseEntity<List<DriverResponseDto>> findClinics() {
        List<Driver> result = driverService.gerDrivers();
        List<DriverResponseDto> dtos = driverMapper.fromDriverListToResponseDtoList(result);
        return ResponseEntity.ok(dtos);
    }

}
