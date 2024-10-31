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

        Sector belgrano = new Belgrano("belgrano");
        Sector sanMartin = new SanMartin("sanmartin");
        Sector sivori = new Sivori("sivori");
        Sector centenario = new Centenario("centenario");

        sectores.put(belgrano.nombreSector, belgrano);
        sectores.put(sanMartin.nombreSector, sanMartin);
        sectores.put(sivori.nombreSector, sivori);
        sectores.put(centenario.nombreSector, centenario);
    }



    public Sector obetenerSector(String nombreSector) {
        return sectores.get(nombreSector.toLowerCase());
    }

    public void eleminarSector(String nombreSector) {
        sectores.remove(nombreSector.toLowerCase());
    }
}
