package com.example.application;

public class Item {

    String Nazev;
    double celkova_castka;
    double nasetrena_castka;

    public Item(String Nazev, double celkova_castka, double nasetrena_castka){
        this.Nazev = Nazev;
        this.celkova_castka = celkova_castka;
        this.nasetrena_castka = nasetrena_castka;
    }

    public String getNazev() {
        return Nazev;
    }

    public double getCelkova_castka() {
        return celkova_castka;
    }

    public double getNasetrena_castka() {
        return nasetrena_castka;
    }
}



