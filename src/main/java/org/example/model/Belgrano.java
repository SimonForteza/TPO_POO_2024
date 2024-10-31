package org.example.model;

public class Belgrano extends Sector{
    public Belgrano(String nombreSector) {
        super(nombreSector);
        alta = new AlturaSinNumerar(10000);
        media = new AlturaNumerada(5000);
        baja = new AlturaNumerada(5000);
    }
}
