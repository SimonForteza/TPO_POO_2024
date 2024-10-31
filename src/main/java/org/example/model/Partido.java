package org.example.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Partido {
    private Date fecha;
    Map<String, Sector> sectores;

    public Partido(Date fecha) {
        this.fecha = fecha;
        sectores = new HashMap<>();
    }

    public void agregarSector(String nombreSector, Sector sector) {
        sectores.put(nombreSector, sector);
    }

    public Sector obetenerSector(String nombreSector) {
        return sectores.get(nombreSector);
    }

    public void eleminarSector(String nombreSector) {
        sectores.remove(nombreSector);
    }
}
