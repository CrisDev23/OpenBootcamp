package com.practicados;

public class PracticaDos{
    public static void main(String[] args) {

        int precioFinal = precioConIva(150);
        System.out.println("El precio final es: " + precioFinal);


    };

    static int precioConIva(int num1) {
        int iva = (num1 * 10) / 100;
        return num1 + iva;
    };
};
