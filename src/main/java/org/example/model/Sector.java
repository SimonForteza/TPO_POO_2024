package org.example.model;


public abstract class Sector {
    protected String nombreSector;
    protected Altura alta;
    protected Altura media;
    protected Altura baja;

    public Sector(String nombreSector) {
        this.nombreSector = nombreSector;
    }

}
