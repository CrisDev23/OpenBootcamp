package com.practicaCincoTemaCinco;

public class Main {
    public static void main(String[] args) {
        CocheCRUD cocheCrud = new CocheCRUDImpl();

        cocheCrud.delete();
        cocheCrud.save();
        cocheCrud.findAll();
    }
}
