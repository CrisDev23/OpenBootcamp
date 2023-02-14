package com.practicaCuatroTemaTres;

public class EjercicioTema3 {
    public static void main(String[] args) {
        String[] nombres = {" Juan"," Maria"," Estela"," Fernando"};
        String nombresConcatenadosF= "";
        for (int i = 0; i < nombres.length; i++){
           nombresConcatenadosF = nombresConcatenadosF += nombres[i];

        }
        System.out.println(nombresConcatenadosF);
    }
}
