package com.practicaCincoTemaCinco;

public class CocheCRUDImpl implements CocheCRUD{

    private String marca;
    private String modelo;
    private String fechFabricacion;
    private String tipoCombustible;

    public CocheCRUDImpl() {

    }

    public CocheCRUDImpl(String marca, String modelo, String fechFabricacion, String tipoCombustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechFabricacion = fechFabricacion;
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public void save() {
        System.out.println("Save");

    }

    @Override
    public void findAll() {
        System.out.println("findAll");

    }

    @Override
    public void delete() {
        System.out.println("delete");

    }
}
