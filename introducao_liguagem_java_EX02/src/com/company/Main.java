package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("\n------Inverter String--------- ");
        System.out.println("Digite seu nome");
        String digitarNome = teclado.nextLine();

       ManipulaStrings manipulaStrings = new ManipulaStrings();
       manipulaStrings.inverteComStringBuilder(digitarNome);


        System.out.println("\n------Palavra palíndromo----------");
        System.out.println("Digite uma frase");
        String digitarFrase = teclado.nextLine();
        manipulaStrings.palindromo(digitarFrase);



    }


}






