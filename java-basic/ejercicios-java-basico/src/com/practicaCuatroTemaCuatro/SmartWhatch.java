package com.practicaCuatroTemaCuatro;

public class SmartWhatch extends SmartDevice{
    private Double memoriaRam;
    private int duracionBateria;
    private String tipoDeCorrea;
    private boolean resitenteAlAgua;


    public SmartWhatch(){}
    public SmartWhatch(String marca, String tamano, String color, Double costo, Double memoriaRam, int duracionBateria, String tipoDeCorrea, boolean resitenteAlAgua) {
        super(marca, tamano, color, costo);
        this.memoriaRam = memoriaRam;
        this.duracionBateria = duracionBateria;
        this.tipoDeCorrea = tipoDeCorrea;
        this.resitenteAlAgua = resitenteAlAgua;
    }
    @Override
    public String encender(){
        if (isEncendido() == true){
            return  "El Smartwhatch ya esta Encendido";
        }else{
            return "prendiendo Smartwhatch";
        }

    }

    @Override
    public String apagar(){
        if(isEncendido() == true){
             return  "apagando SmartWhatch";
        }else{
            return "ya esta apagado";
        }

    }

    @Override
    public String toString() {
        return "SmartWhatch{" +
                "memoriaRam=" + memoriaRam +
                ", duracionBateria=" + duracionBateria +
                ", tipoDeCorrea='" + tipoDeCorrea + '\'' +
                ", resitenteAlAgua=" + resitenteAlAgua +
                '}';
    }
}
