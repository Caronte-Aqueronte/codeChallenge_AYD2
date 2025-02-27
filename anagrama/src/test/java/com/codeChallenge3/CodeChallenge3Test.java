/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeChallenge3;

import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Luis Monterroso
 */

public class CodeChallenge3Test {

    @Test
    public void addStudentTest() {
        //-------------------------------------------------------------------------------------------------------------------------preparacion
        Map<Student, Integer> students = new LinkedHashMap<>();
        Department department = new Department(students);
        String expected = """
                          Nombre Estudiante: Ana, Apellido del estudiante: Monterroso, Nota: 50
                          Nombre Estudiante: Barka, Apellido del estudiante: Quedira, Nota: 20
                          Nombre Estudiante: Carlos, Apellido del estudiante: Briones, Nota: 10
                          Nombre Estudiante: Felipe, Apellido del estudiante: Lopez, Nota: 10
                          """;

        //-------------------------------------------------------------------------------------------------------------------------ejecucion
        //agregamos a los estudiantes
        department.addOrReplaceStudent(new Student("Ana", "Monterroso"), 50);
        department.addOrReplaceStudent(new Student("Barka", "Quedira"), 20);
        department.addOrReplaceStudent(new Student("Carlos", "Briones"), 10);
        department.addOrReplaceStudent(new Student("Felipe", "Lopez"), 10);
        String response = department.printStrudents();//imprimimos a los estudiantesS

        //-------------------------------------------------------------------------------------------------------------------------respuesta
        Assertions.assertEquals(expected, response);
    }

    @Test
    public void replaceStrudentTest() {
        //-------------------------------------------------------------------------------------------------------------------------preparacion
        Map<Student, Integer> students = new LinkedHashMap<>();
        Department department = new Department(students);

        String expected = """
                          Nombre Estudiante: Ana, Apellido del estudiante: Monterroso, Nota: 50
                          Nombre Estudiante: Barka, Apellido del estudiante: Quedira, Nota: 20
                          Nombre Estudiante: Felipe, Apellido del estudiante: Briones, Nota: 99
                          """;

        //-------------------------------------------------------------------------------------------------------------------------ejecucion
        //agregamos a los estudiantes
        department.addOrReplaceStudent(new Student("Ana", "Monterroso"), 50);
        department.addOrReplaceStudent(new Student("Barka", "Quedira"), 20);
        department.addOrReplaceStudent(new Student("Carlos", "Briones"), 10);
        department.addOrReplaceStudent(new Student("Felipe", "Briones"), 99);

        String response = department.printStrudents();
        //-------------------------------------------------------------------------------------------------------------------------respuesta
        Assertions.assertEquals(expected, response);
    }

    @Test
    public void testPrintStrudents() {
        //-------------------------------------------------------------------------------------------------------------------------preparacion
        Map<Student, Integer> students = new LinkedHashMap<>();
        Department department = new Department(students);
        department.addOrReplaceStudent(new Student("Ana", "Monterroso"), 50);
        department.addOrReplaceStudent(new Student("Barka", "Quedira"), 20);
        department.addOrReplaceStudent(new Student("Carlos", "Briones"), 10);
        String expected = """
                          Nombre Estudiante: Ana, Apellido del estudiante: Monterroso, Nota: 50
                          Nombre Estudiante: Barka, Apellido del estudiante: Quedira, Nota: 20
                          Nombre Estudiante: Carlos, Apellido del estudiante: Briones, Nota: 10
                          """;
        //-------------------------------------------------------------------------------------------------------------------------ejecucion
        String response = department.printStrudents();

        //-------------------------------------------------------------------------------------------------------------------------respuesta
        Assertions.assertEquals(expected, response);
    }

    @Test
    public void testPrintEmptyStrudents() {
        //preparacion
        Department departement = new Department(new LinkedHashMap<>());
        String expected = "";

        //ejecucion
        String response = departement.printStrudents();

        //respuesta
        Assertions.assertEquals(expected, response);
    }

}
