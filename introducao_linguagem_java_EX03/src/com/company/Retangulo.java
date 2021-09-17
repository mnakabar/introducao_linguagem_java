package com.company;

public class Retangulo {

    //Calcular area
    public double calcularArea(double ladoA, double ladoB){
        return  ladoA * ladoB;
    }

    // Calcular perimetro
    public  double calculaPerimetro(double ladoA, double ladoB){
        return (2 * ladoA) + (2 * ladoB);
    }

    //Calcular quantidade do piso
    public double quantidadePiso(double areaLajota, double areaTotal){
        return areaTotal/areaLajota;
    }

    //Calcular quantidade de rodapé
    public double quatidadeRodapé(double comprimentoLajota, double perimetro){
        return perimetro/comprimentoLajota;
    }


}
