/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.anagrama;

import java.util.Arrays;

/**
 *
 * @author Luis Monterroso
 */
public class Anagrama {

    public static void main(String[] args) {
        Anagrama anagrama = new Anagrama();
        System.out.println(anagrama.isAnagrama("coco", "ococ"));
    }

    public Boolean isAnagrama(String word1, String word2) {

        if (word1.length() != word2.length()) {// si no son iguales los tamanios entonces no son anagramas
            return false;
        }

        // Convertir a array de caracteres 
        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();

        //ordenamos los arrays en orden alfabetico
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Comparamos los arrays y retornamos si son iguales
        return Arrays.equals(charArray1, charArray2);

    }
}
