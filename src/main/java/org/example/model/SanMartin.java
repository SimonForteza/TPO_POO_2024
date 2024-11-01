package org.example.model;

public class SanMartin extends Sector{
    public SanMartin(String nombreSector) {
        super(nombreSector);
        alta = new AlturaSinNumerar(10000, 5000);
        media = new AlturaNumerada(5000, 10000);
        baja = new AlturaNumerada(5000, 50000);
    }
}
