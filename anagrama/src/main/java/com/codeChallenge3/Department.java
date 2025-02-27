/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeChallenge3;

import java.util.Map;

/**
 *
 * @author Luis Monterroso
 */
public class Department {

    private final Map<Student, Integer> students;

    public Department(Map<Student, Integer> students) {
        this.students = students;
    }

    /**
     * O(n)
     *
     * @return
     */
    public String printStrudents() {
        StringBuilder salida = new StringBuilder();

        //iterar sobre el map o(n)
        students.forEach((student, mark) -> {
            salida.append(String.format("Nombre Estudiante: %s, Apellido del estudiante: %s, Nota: %s\n",
                    student.getName(), student.getLastName(), mark.toString()));
        });

        String response = salida.toString();
        System.out.println(response);
        return response;
    }

    public void addOrReplaceStudent(Student newStudent, Integer mark) {
        Student toRemove = null;

        //buscar si el apellido ya existe en el mapa
        for (Student student : students.keySet()) {
            //si se cumple entonces guardamos la referencia
            if (student.getLastName().equals(newStudent.getLastName())) {
                toRemove = student;
                break;//romper el ciclo
            }
        }

        //si la bandera se activo entonces borramos
        if (toRemove != null) {
            students.remove(toRemove);
        }

        //finalmente agregar
        students.put(newStudent, mark);
    }

}
