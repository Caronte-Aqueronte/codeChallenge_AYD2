/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ayd.codeChallenge4.drivers.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 *
 * @author Luis Monterroso
 */
@Data
public class DriverCreateDto {

    @NotBlank(message = "El nombre no puede estar vacio o nulo.")
    private String name;
    @NotNull(message = "La edad no puede ser nula.")
    @Min(value = 0, message = "La edad no puede ser menor a 0.")
    private Integer age;

    public DriverCreateDto(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

}
