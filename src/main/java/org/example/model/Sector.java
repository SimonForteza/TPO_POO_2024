package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Sector {
    private String nombreSector;
    Altura alta;
    Altura media;
    Altura baja;


    public Sector(String nombreSector, int capacidad) {
        this.nombreSector = nombreSector;

        if (nombreSector.equals("Belgrano") || nombreSector.equals("San Martin")) {
            this.alta = new AlturaNoNumerada("alta", capacidad);
            this.media = new AlturaNumerada("media", capacidad);
            this.baja = new AlturaNumerada("baja", capacidad);
        } else if (nombreSector.equals("Sivori") || nombreSector.equals("Centenario")) {
            this.alta = new AlturaNoNumerada("alta", capacidad);
            this.media = new AlturaNumerada("media", capacidad);
            this.baja = new AlturaNoNumerada("baja", capacidad);
        }
    }

    public String getNombreSector() {
        return nombreSector;
    }

    public Altura getAlta() {
        return alta;
    }

    public Altura getMedia() {
        return media;
    }

    public Altura getBaja() {
        return baja;
    }

}
