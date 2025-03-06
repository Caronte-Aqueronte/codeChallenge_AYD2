/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ayd.codeChallenge4.drivers.mappers;

import ayd.codeChallenge4.drivers.dto.DriverCreateDto;
import ayd.codeChallenge4.drivers.dto.DriverResponseDto;
import ayd.codeChallenge4.drivers.models.Driver;
import java.util.List;
import org.mapstruct.Mapper;

/**
 *
 * @author Luis Monterroso
 */
@Mapper(componentModel = "spring")
public interface DriverMapper {

    public Driver fromCreateDtoToDriver(DriverCreateDto dto);

    public DriverResponseDto fromDriverToDto(Driver driver);

    public List<DriverResponseDto> fromDriverListToResponseDtoList(List<Driver> drivers);
}
