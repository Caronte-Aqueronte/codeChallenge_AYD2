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
        AnagramManager anagramaManager = new AnagramManager("espada", "pesada");
        System.out.println(anagramaManager.isAnagrama());
    }

}
