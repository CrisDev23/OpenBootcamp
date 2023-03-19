package com.practicaCuatroTemaCuatro;

public class SmartPhone extends SmartDevice{
    private Double memoriaRam;
    private String procesador;
    private int duracionBateria;
    private boolean camaraFrontal;
    private String camaraTrasera;



    public SmartPhone(){

    }

    public SmartPhone(String marca, String tamano, String color, Double costo, Double memoriaRam, String procesador, int duracionBateria, boolean camaraFrontal, String camaraTrasera) {
        super(marca, tamano, color, costo);
        this.memoriaRam = memoriaRam;
        this.procesador = procesador;
        this.duracionBateria = duracionBateria;
        this.camaraFrontal = camaraFrontal;
        this.camaraTrasera = camaraTrasera;
    }

    @Override
    public String encender(){
        if (isEncendido() == true){
            return "El Smartphone ya esta Encendido";

        }else{

            return "prendiendo el Smartphone";
        }


    }

    @Override
    public String apagar(){
        if(isEncendido() == true)
        {
            return  "apagando Smartphone";
        }else {
            return "ya esta apagado";
        }

    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "memoriaRam=" + memoriaRam +
                ", procesador='" + procesador + '\'' +
                ", duracionBateria=" + duracionBateria +
                ", camaraFrontal=" + camaraFrontal +
                ", camaraTrasera='" + camaraTrasera + '\'' +
                '}';
    }
}
