package com.practicaCuatroTemaCuatro;

public abstract class SmartDevice {
    private String marca;
    private String tamano;
    private String color;
    private Double costo;
    private Double peso;
    private boolean encendido;

    private String versionSo;

    SmartDevice(){

    }

    public SmartDevice(String marca, String tamano, String color, Double costo) {
        this.marca = marca;
        this.tamano = tamano;
        this.color = color;
        this.costo = costo;

    }

    public boolean isEncendido() {
        return encendido;
    }

    public abstract String encender();


    public String apagar(){
        return "apagado";
    }

    public String getVersionSo() {
        return versionSo;
    }

    public void setVersionSo(String versionSo) {
        this.versionSo = versionSo;
    }

    public String toString() {
        return "SmartDevice{" +
                "marca='" + marca + '\'' +
                ", tamano='" + tamano + '\'' +
                ", color='" + color + '\'' +
                ", costo=" + costo +
                ", peso=" + peso +
                '}';
    }
}
