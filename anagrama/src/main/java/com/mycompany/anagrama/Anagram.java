/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.anagrama;

/**
 *
 * @author Luis Monterroso
 */
public class Anagram {

    public static void main(String[] args) {
        //usar el manager de anagrama para analizar las palabras
        AnagramManager anagramManager = new AnagramManager("espada", "pesada");
        System.out.println(anagramManager.isAnagrama());//imprimir la respuesta del metodo
    }

}
