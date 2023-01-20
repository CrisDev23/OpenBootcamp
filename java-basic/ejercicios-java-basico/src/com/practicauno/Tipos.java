package com.practicauno;


// EJERCICIO 1 JAVA BASICO

public class Tipos {
    public static void main(String[] args) {
        //dato primitivo enpieza con minuscula y no pueden tener un valor nulo

        //clase empieza con mayusculas

        // 1.numericos

        //1.1 enteros
        // se usa cada uno capacidad es decir tienen capacidad determinada de almacenamiento de num.
        byte var1 = 5; // dato primitivo
        short var2 = 10; // dato primitivo
        int var3 = 30; // dato primitivo
        long var4 =100; // dato primitivo

        //1.2decimales
        //tambien cada variante de tipo de decimal es por la capacidad de almacenamiento
        float var5 = 5.5f; // dato primitivo
        double var6 = 10.5d; // dato primitivo

        //2.booleanos
        boolean var7 = true; // dato primitivo
        boolean var8 = false; // dato primitivo

        //3.texto

        char var9 = 'a'; // dato primitivo

        String var10 = "lorem itsu sfd las "; // este es un tipo de dato una clase

        System.out.println("     DATOS PRIMITIVOS NUMEROS   ");
        System.out.println("Tipo  entero byte:  " + var1);
        System.out.println("Tipo  entero short: " + var2);
        System.out.println("Tipo  entero int: " + var3);
        System.out.println("Tipo  entero long: " + var4);
        System.out.println("Tipo  decimal float: " + var5);
        System.out.println("Tipo  decimal double: "+ var6);
        System.out.println("     DATOS PRIMITIVOS BOLEANOS   ");
        System.out.println(var7);
        System.out.println(var8);
        System.out.println("     DATOS PRIMITIVO CARACTÉR ");
        System.out.println(var9);
        System.out.println("     DATOS NO PRIMITIVOS CLASE String   ");
        System.out.println(var10);


    };
};
