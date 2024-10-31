package org.example.model;

public class Sivori extends Sector{
    public Sivori(String nombreSector) {
        super(nombreSector);
        alta = new AlturaSinNumerar(5000);
        media = new AlturaNumerada(2500);
        baja = new AlturaSinNumerar(5000);
    }
}
