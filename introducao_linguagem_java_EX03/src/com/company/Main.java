package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo();
        System.out.println("\n-------Calcular área-----------------------");
        double area = retangulo.calcularArea(10, 5);
        System.out.println("Area do retangulo 10 por 5 é igual a:" + area);

        System.out.println("\n-------Calcular perímetro------------------");
        double perimetro = retangulo.calculaPerimetro(20, 10);
        System.out.println("O perimetro do retangulo  20 por 10 é igual a:" + perimetro);

        System.out.println("\n-------Calcular quantidade de piso---------");
        double qtdePiso = retangulo.quantidadePiso(3, 21);
        System.out.println("Quantidade de piso para 21 metros é igual a:" + qtdePiso);

        System.out.println("\n-------Calcular quantidade de rodapé---------");
        double qtdoRodaPe = retangulo.quatidadeRodapé(2, 20);
        System.out.println("Quantidade de rodapeé para 20 metros é igual a:" + qtdoRodaPe);


    }
}
