package com.company;

import java.util.Locale;

public class ManipulaStrings {

    public java.lang.System System;

    //Inverter String
    public void inverteComStringBuilder(String digitarNome) {
        System.out.print("\t");
        StringBuilder invertido = new StringBuilder(digitarNome.toUpperCase(Locale.ROOT)).reverse();
        System.out.println(invertido);
    }


    //metodo palidromo
    public void palindromo(String frase) {
        String semEspaco = frase.replace(" ", "").toLowerCase(Locale.ROOT);
        int i = 0;
        while (i < semEspaco.length()) {
            if (semEspaco.charAt(i) != semEspaco.charAt(semEspaco.length() - i -1)) {
                System.out.println("Não é um Palíndromo.");
                System.exit(0);
            }
            i++;
        }
        System.out.println("É um palíndromo");
    }





}
