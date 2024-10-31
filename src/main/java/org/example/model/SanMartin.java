package org.example.model;

public class SanMartin extends Sector{
    public SanMartin(String nombreSector) {
        super(nombreSector);
        alta = new AlturaSinNumerar(10000);
        media = new AlturaNumerada(5000);
        baja = new AlturaNumerada(5000);
    }
}
