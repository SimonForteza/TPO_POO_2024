package org.example.model;

import java.util.*;

public class Estadio {
    List<Sector>sectores;

    public Estadio() {
        sectores = new ArrayList<>();

        sectores.add(new Belgrano("belgrano"));
        sectores.add(new SanMartin("sanmartin"));
        sectores.add(new Sivori("sivori"));
        sectores.add(new Centenario("centenario"));
    }

    public void reservarSector(String nombreSector, String altura, int numeroAsiento) {
        for (Sector sector: sectores) {
            if (nombreSector.equals(sector.getNombreSector())) {
                sector.reservarAltura(altura, numeroAsiento);
                return;
            }
        }
        System.out.println("el nombre del sector no se encuentra");
    }

}
