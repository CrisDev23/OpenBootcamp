package com.practicaCuatroTemaCuatro;

public class Main {
    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone("Samsung","Grande","Negro",10.5,3.7,"Redragon 8",5,true," 15mpx");

        System.out.println(smartPhone.toString());
        System.out.println(smartPhone.encender());
        smartPhone.setVersionSo("android  pie 9.0");
        System.out.println(smartPhone.getVersionSo());

        SmartPhone smartPhone1 = new SmartPhone("Motorola","Median","Blanco",90.7,5.7,"qualcom",6,false,"20mpx");
        System.out.println(smartPhone1.toString());
        System.out.println(smartPhone1.encender());
        smartPhone1.setVersionSo("android Red Velvet Cake 11.0");
        System.out.println(smartPhone1.getVersionSo());

        SmartWhatch smartWhatch = new SmartWhatch("Aple","Mediano","Gris",30.5,0.514,10,"Cuero",true);
        System.out.println(smartWhatch.toString());
        System.out.println(smartWhatch.encender());
        smartWhatch.setVersionSo("Aple WhatchOS 4");
        System.out.println(smartWhatch.getVersionSo());
    }
}
