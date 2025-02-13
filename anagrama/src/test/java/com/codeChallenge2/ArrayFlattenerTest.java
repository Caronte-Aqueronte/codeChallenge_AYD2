/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeChallenge2;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Luis Monterroso
 */
public class ArrayFlattenerTest {

    @Test
    public void testFlatArray() {
        Object[] input = {1, 2, 3, 4};
        Object[] expected = {1, 2, 3, 4};
        ArrayFlattener flattener = new ArrayFlattener(input);

        System.err.println(String.format("Original: %s, Resultado: %s",
                Arrays.deepToString(input), Arrays.toString(flattener.flatten())));
        Assertions.assertArrayEquals(expected, flattener.flatten());
    }

    @Test
    public void testEmpyArray() {
        Object[] input = {};
        Object[] expected = {};
        ArrayFlattener flattener = new ArrayFlattener(input);
        System.err.println(String.format("Original: %s, Resultado: %s",
                Arrays.deepToString(input), Arrays.toString(flattener.flatten())));
        Assertions.assertArrayEquals(expected, flattener.flatten());
    }

    @Test
    public void testArrayWithOneLevel() {
        Object[] input = {1, new Object[]{2, 3}, 4};
        Object[] expected = {1, 2, 3, 4};
        ArrayFlattener flattener = new ArrayFlattener(input);
        System.err.println(String.format("Original: %s, Resultado: %s",
                Arrays.deepToString(input), Arrays.toString(flattener.flatten())));
        Assertions.assertArrayEquals(expected, flattener.flatten());
    }

    @Test
    public void testArrayWithMultipleLevels() {
        Object[] input = {1, new Object[]{2, new Object[]{3, 4}}, 5};
        Object[] expected = {1, 2, 3, 4, 5};
        ArrayFlattener flattener = new ArrayFlattener(input);
        System.err.println(String.format("Original: %s, Resultado: %s",
                Arrays.deepToString(input), Arrays.toString(flattener.flatten())));
        Assertions.assertArrayEquals(expected, flattener.flatten());
    }

    @Test
    public void testArrayWithEmptySubArraysVacios() {
        Object[] input = {1, new Object[]{}, 2, new Object[]{3, new Object[]{}}, 4};
        Object[] expected = {1, 2, 3, 4};
        ArrayFlattener flattener = new ArrayFlattener(input);
        System.err.println(String.format("Original: %s, Resultado: %s",
                Arrays.deepToString(input), Arrays.toString(flattener.flatten())));
        Assertions.assertArrayEquals(expected, flattener.flatten());
    }
}
