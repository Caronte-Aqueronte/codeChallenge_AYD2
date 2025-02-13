/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeChallenge2;

/**
 *
 * @author Luis Monterroso
 */
public class ArrayFlattener {

    private final Object[] array;

    public ArrayFlattener(Object[] array) {
        this.array = array;
    }

    public Object[] flatten() {
        int totalLength = countElements(this.array);
        Object[] flatArray = new Object[totalLength];
        fillFlatArray(this.array, flatArray, 0);
        return flatArray;
    }

    private int countElements(Object[] array) {
        int count = 0;// variable que contara cuantos elementos tiene el array en total
        for (Object item : array) {//recorrer todo el array
            if (item instanceof Object[]) {//si el elemento es instancia de array entonces mandamos a contar si count
                count += countElements((Object[]) item);
            } else {//si no entonces solo contamos
                count++;
            }
        }
        return count;//devovlemos el total de la cuenta
    }

    private int fillFlatArray(Object[] array, Object[] flatArray, int position) {
        for (Object item : array) {
            if (item instanceof Object[]) {
                // llamada recursiva: retorna la nueva posición después de procesar el subarray
                position = fillFlatArray((Object[]) item, flatArray, position);
            } else {
                // agregar elemento al array plano y aumentar la posición
                flatArray[position] = item;
                position++;
            }
        }
        return position; // retorna la posición actualizada después de agregar elementos
    }

}
