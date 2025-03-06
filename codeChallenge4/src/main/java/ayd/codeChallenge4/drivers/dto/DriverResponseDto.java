/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ayd.codeChallenge4.drivers.dto;

import lombok.Data;

/**
 *
 * @author Luis Monterroso
 */
@Data
public class DriverResponseDto {

    private String id;

    private String name;

    private Integer age;

    public DriverResponseDto(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

}
