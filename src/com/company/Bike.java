package com.company;

public class Bike {

    String bno;
    String name;
     int days;
    int charge;
    int vehicle;
    String vd;
    int meter;

    void bike(String bno, String name, int days, int charge, int vehicle, String vd, int meter) {

        this.bno = bno;
        this.name = name;
        this.days = days;
        this.charge = charge;
        this.vehicle = vehicle;
        this.vd = vd;
        this.meter = meter;
    }
    void bike(String bno, String name, int charge, int vehicle, String vd, int meter) {
        this.bno = bno;
        this.name = name;
        this.charge = charge;
        this.vehicle = vehicle;
        this.vd = vd;
        this.meter = meter;
    }

    void displayBikeDetails() {
        System.out.println("Bike No.=" + bno);
        System.out.println("Name=" + name);
        System.out.println("Days=" + days);
        System.out.println("Charge=" + charge);
        System.out.println("vehicle=" + vehicle);
        System.out.println("vd=" + vd);
        System.out.println("meter=" + meter);
    }

    void displayBikeDetails1() {
        System.out.println("Bike No.=" + bno);
        System.out.println("Name=" + name);
        System.out.println("Charge=" + charge);
        System.out.println("vehicle=" + vehicle);
        System.out.println("vd=" + vd);
        System.out.println("meter=" + meter);
    }
    public static void main(String arg[]) {


        Bike b = new Bike();
        b.bike("0101", "HONDA", 10, 1500, 155,"TS7gp1516", 001235);
        b.displayBikeDetails();
        System.out.println("-----------------");
        b.bike("234","245",34,56,"45",34);
        b.displayBikeDetails1();




    }
}

